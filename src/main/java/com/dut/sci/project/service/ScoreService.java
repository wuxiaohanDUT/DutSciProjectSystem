package com.dut.sci.project.service;


import com.dut.sci.project.dto.ScoreRecordDTO;
import com.dut.sci.project.dto.UserDTO;
import com.dut.sci.project.dto.UserPointsDTO;
import com.dut.sci.project.repository.ScoreRecordRepository;
import com.dut.sci.project.repository.UserRepository;
import org.assertj.core.util.Lists;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class ScoreService {

    @Resource
    private ScoreRecordRepository scoreRecordRepository;

    @Resource
    private UserRepository userRepository;

    public List<ScoreRecordDTO> getUserScoreRecord(Long userId, Date beginTime, Date endTIme) {
        return scoreRecordRepository.getUserScoreRecord(userId, beginTime, endTIme);
    }

    public List<UserPointsDTO> getUserPoints(Date begin, Date end, Integer year, String college) {
        List<UserDTO> userDTOList1 = userRepository.getUserByCollegeAadYear(college, year);
        if (CollectionUtils.isEmpty(userDTOList1)) {
            return null;
        }
        List<String> userIds1 = userDTOList1.stream().map(e -> e.getUserId().toString()).collect(Collectors.toList());
        List<ScoreRecordDTO> scoreRecordDTOList = scoreRecordRepository.getUserScoreRecords(userIds1, begin, end);
        Map<Long, Integer> id2Points = new HashMap<>();
        for (ScoreRecordDTO scoreRecordDTO : scoreRecordDTOList) {
            Long userId = Long.valueOf(scoreRecordDTO.getUserId());
            Integer points = scoreRecordDTO.getPoints();
            if (id2Points.containsKey(userId)) {
                points += id2Points.get(userId);
            }
            id2Points.put(userId, points);
        }
        List<UserPointsDTO> userPointsDTOList = Lists.newArrayList();
        List<Long> userIds = Lists.newArrayList();
        for (Map.Entry<Long, Integer> entry : id2Points.entrySet()) {
            Long userId = entry.getKey();
            Integer points = entry.getValue();
            UserPointsDTO userPointsDTO = new UserPointsDTO();
            userPointsDTO.setUserId(userId);
            userPointsDTO.setPoints(points);
            userPointsDTOList.add(userPointsDTO);
            userIds.add(userId);
        }
        List<UserDTO> userDTOList = userRepository.getUserDTOListByIds(userIds);
        Map<Long, String> id2Name = userDTOList.stream().collect(Collectors.toMap(e -> e.getUserId(), e -> e.getUserName(), (key1, key2) -> key1));
        Map<Long, String> id2Class = userDTOList.stream().collect(Collectors.toMap(e -> e.getUserId(), e -> e.getUserClass(), (key1, key2) -> key1));
        for (UserPointsDTO userPointsDTO : userPointsDTOList) {
            userPointsDTO.setUserClass(id2Class.get(userPointsDTO.getUserId()));
            userPointsDTO.setUserName(id2Name.get(userPointsDTO.getUserId()));
        }
        return userPointsDTOList.stream().sorted(new Comparator<UserPointsDTO>() {
            @Override
            public int compare(UserPointsDTO o1, UserPointsDTO o2) {
                return o2.getPoints() - o1.getPoints();
            }
        }).collect(Collectors.toList());
    }
}