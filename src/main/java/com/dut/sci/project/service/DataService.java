package com.dut.sci.project.service;

import com.dut.sci.project.dto.CollegeFormDTO;
import com.dut.sci.project.dto.FormDTO;
import com.dut.sci.project.dto.UserDTO;
import com.dut.sci.project.repository.FormRepository;
import com.dut.sci.project.repository.UserRepository;
import org.assertj.core.util.Lists;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class DataService {

    @Resource
    private FormRepository formRepository;

    @Resource
    private UserRepository userRepository;

    public List<CollegeFormDTO> getCollegeFormNums(Date begin, Date end, Byte type) {
        List<FormDTO> formDTOList = formRepository.getSuccessFormsByTime(begin, end, type);
        if (CollectionUtils.isEmpty(formDTOList)) {
            return null;
        }
        Set<Long> applicantIdSet = formDTOList.stream().map(e -> e.getApplicantId()).collect(Collectors.toSet());
        List<Long> applicantIds = applicantIdSet.stream().collect(Collectors.toList());
        List<UserDTO> userDTOList = userRepository.getUserDTOListByIds(applicantIds);
        Map<Long, String> id2College = userDTOList.stream().collect(Collectors.toMap(e -> e.getUserId(), e -> e.getUserCollege(), (key1, key2) -> key1));
        Map<String, Integer> college2Num = new HashMap<>();
        for (FormDTO formDTO : formDTOList) {
            Long userId = formDTO.getApplicantId();
            String college = id2College.get(userId);
            Integer nums = 1;
            if (college2Num.containsKey(college)) {
                nums += college2Num.get(college);
            }
            college2Num.put(college, nums);
        }
        List<CollegeFormDTO> collegeFormDTOList = Lists.newArrayList();
        for (Map.Entry<String, Integer> entry : college2Num.entrySet()) {
            CollegeFormDTO collegeFormDTO = new CollegeFormDTO();
            collegeFormDTO.setCollege(entry.getKey());
            collegeFormDTO.setNums(entry.getValue());
            collegeFormDTOList.add(collegeFormDTO);
        }
        return collegeFormDTOList;
    }

}
