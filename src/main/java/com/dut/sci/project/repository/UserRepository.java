package com.dut.sci.project.repository;

import com.dut.sci.project.converter.UserConverter;
import com.dut.sci.project.domain.UserDO;
import com.dut.sci.project.domain.UserDOExample;
import com.dut.sci.project.dto.UserDTO;
import com.dut.sci.project.mapper.UserDOMapper;
import org.apache.ibatis.session.RowBounds;
import org.assertj.core.util.Lists;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Repository
public class UserRepository {

    @Resource
    private UserDOMapper userDOMapper;

    public UserDTO getUserDTOById(Long userId) {
        UserDO userDO = userDOMapper.selectByPrimaryKey(userId);
        if (null == userDO) {
            return null;
        }
        return UserConverter.UserDO2DTO(userDO);
    }

    public List<UserDTO> getUserDTOListByIds(List<Long> userIds) {
        if (CollectionUtils.isEmpty(userIds)) {
            return Lists.newArrayList();
        }
        UserDOExample userDOExample = new UserDOExample();
        UserDOExample.Criteria criteria = userDOExample.createCriteria();
        criteria.andUserIdIn(userIds);
        List<UserDO> userDOList = userDOMapper.selectByExample(userDOExample);
        if (CollectionUtils.isEmpty(userDOList)) {
            return null;
        }
        return UserConverter.convertToDTOList(userDOList);
    }

    public Boolean updateUserInfo(UserDTO userDTO) {
        if (null == userDTO) {
            return false;
        }
        UserDO userDO = UserConverter.UserDTO2DO(userDTO);
        return userDOMapper.updateByPrimaryKeySelective(userDO) != 0;
    }

    public List<UserDTO> getUserByCollegeAadYear(String college, Integer year) {
        UserDOExample userDOExample = new UserDOExample();
        UserDOExample.Criteria criteria = userDOExample.createCriteria();
        if (null != college) {
            criteria.andUserCollegeEqualTo(college);
        }
        if (null != year) {
            criteria.andUserYearEqualTo(year);
        }
        List<UserDO> userDOList = userDOMapper.selectByExample(userDOExample);
        return UserConverter.convertToDTOList(userDOList);
    }

    public List<String> getAllCollege() {
        UserDOExample userDOExample = new UserDOExample();
        UserDOExample.Criteria criteria = userDOExample.createCriteria();
        criteria.andUserGenderEqualTo(false);
        int year = new Date().getYear() + 1900 - 1;
        criteria.andUserYearEqualTo(year);
        List<UserDO> userDOList = userDOMapper.selectByExample(userDOExample);
        if (CollectionUtils.isEmpty(userDOList)) {
            return null;
        }
        Set<String> collegeSet = userDOList.stream().map(e -> e.getUserCollege()).collect(Collectors.toSet());
        return collegeSet.stream().collect(Collectors.toList());
    }
}
