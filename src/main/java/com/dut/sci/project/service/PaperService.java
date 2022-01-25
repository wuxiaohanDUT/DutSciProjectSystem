package com.dut.sci.project.service;

import com.dut.sci.project.dto.PaperDTO;
import com.dut.sci.project.dto.UserDTO;
import com.dut.sci.project.repository.PaperRepository;
import com.dut.sci.project.repository.UserRepository;
import org.assertj.core.util.Lists;
import org.assertj.core.util.Sets;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PaperService {

    @Resource
    private PaperRepository paperRepository;

    @Resource
    private UserRepository userRepository;

    public PaperDTO getPaperById(Long paperId) {
        return paperRepository.getPaperById(paperId);
    }

    public List<PaperDTO> getPaperByUserId(String userId, Integer pageNum, Integer pageSize) {
        List<PaperDTO> paperDTOList = paperRepository.getPaperByUserId(userId, pageNum, pageSize);
        Set<Long> idSet = Sets.newHashSet();
        for (PaperDTO paperDTO : paperDTOList) {
            paperDTO.getAuthorIds().stream().forEach(e -> idSet.add(Long.valueOf(e)));
        }
        List<Long> idList = idSet.stream().collect(Collectors.toList());
        List<UserDTO> userDTOList = userRepository.getUserDTOListByIds(idList);
        Map<Long, String> id2Name = userDTOList.stream().collect(Collectors.toMap(e -> e.getUserId(), e -> e.getUserName()));
        for (PaperDTO paperDTO : paperDTOList) {
            List<String> userIds = paperDTO.getAuthorIds();
            List<String> authorNames = Lists.newArrayList();
            for (String id : userIds) {
                Long idOfLong = Long.valueOf(id);
                authorNames.add(id2Name.get(idOfLong));
            }
            paperDTO.setAuthorNames(authorNames);
        }
        return paperDTOList;
    }
}