package com.dut.sci.project.converter;

import com.dut.sci.project.domain.UserDO;
import com.dut.sci.project.dto.UserDTO;
import com.dut.sci.project.vo.UserVO;
import org.assertj.core.util.Lists;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.List;

public class UserConverter {

    public static UserDO UserDTO2DO(UserDTO userDTO) {
        if (null == userDTO) {
            return null;
        }
        UserDO userDO = new UserDO();
        userDO.setUserId(userDTO.getUserId());
        userDO.setUserPassword(userDTO.getUserPassword());
        userDO.setUserName(userDTO.getUserName());
        userDO.setUserPhoneNumber(userDTO.getUserPhoneNumber());
        userDO.setUserEmail(userDTO.getUserEmail());
        userDO.setUserGender(userDTO.getUserGender());
        userDO.setUserCollege(userDTO.getUserCollege());
        userDO.setUserClass(userDTO.getUserClass());
        userDO.setUserType(userDTO.getUserType());
        return userDO;
    }

    public static UserDTO UserDO2DTO(UserDO userDO) {
        if (null == userDO) {
            return null;
        }
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(userDO.getUserId());
        userDTO.setUserClass(userDO.getUserClass());
        userDTO.setUserCollege(userDO.getUserCollege());
        userDTO.setUserEmail(userDO.getUserEmail());
        userDTO.setUserGender(userDO.getUserGender());
        userDTO.setUserName(userDO.getUserName());
        userDTO.setUserType(userDO.getUserType());
        userDTO.setUserPassword(userDO.getUserPassword());
        userDTO.setUserPhoneNumber(userDO.getUserPhoneNumber());
        return userDTO;
    }

    public static UserVO UserDTO2VO(UserDTO userDTO) {
        if (null == userDTO) {
            return null;
        }
        UserVO userVO = new UserVO();
        userVO.setUserId(userDTO.getUserId());
        userVO.setUserType(userDTO.getUserType());
        userVO.setUserName(userDTO.getUserName());
        userVO.setUserGender(userDTO.getUserGender());
        userVO.setUserCollege(userDTO.getUserCollege());
        userVO.setUserEmail(userDTO.getUserEmail());
        userVO.setUserClass(userDTO.getUserClass());
        userVO.setUserPhoneNumber(userDTO.getUserPhoneNumber());
        userVO.setPassword(userDTO.getUserPassword());
        return userVO;
    }

    public static UserDTO UserVO2DTO(UserVO userVO) {
        if (null == userVO) {
            return null;
        }
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(userVO.getUserId());
        userDTO.setUserType(userVO.getUserType());
        userDTO.setUserName(userVO.getUserName());
        userDTO.setUserEmail(userVO.getUserEmail());
        userDTO.setUserGender(userVO.getUserGender());
        userDTO.setUserClass(userVO.getUserClass());
        userDTO.setUserPhoneNumber(userVO.getUserPhoneNumber());
        userDTO.setUserPassword(userVO.getPassword());
        userDTO.setUserCollege(userVO.getUserCollege());
        return userDTO;
    }

    public static List<UserDO> UserDOList2DTOList(List<UserDTO> userDTOList) {
        if (CollectionUtils.isEmpty(userDTOList)) {
            return null;
        }
        List<UserDO> userDOList = Lists.newArrayList();
        for(UserDTO userDTO : userDTOList) {
            userDOList.add(UserDTO2DO(userDTO));
        }
        return userDOList;
    }

    public static List<UserDTO> convertToDTOList(List<UserDO> userDOList) {
        if (CollectionUtils.isEmpty(userDOList)) {
            return null;
        }
        List<UserDTO> userDTOList = Lists.newArrayList();
        for(UserDO userDO : userDOList) {
            userDTOList.add(UserDO2DTO(userDO));
        }
        return userDTOList;
    }
}
