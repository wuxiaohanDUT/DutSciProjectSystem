package com.dut.sci.project.converter;

import com.dut.sci.project.domain.UserDO;
import com.dut.sci.project.dto.UserDTO;
import org.assertj.core.util.Lists;

import java.util.List;

public class UserConverter {

    public static UserDO convertToDO(UserDTO userDTO) {
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

    public static UserDTO convertToDTO(UserDO userDO) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(userDO.getUserId());
        userDTO.setUserClass(userDTO.getUserClass());
        userDTO.setUserCollege(userDTO.getUserCollege());
        userDTO.setUserEmail(userDTO.getUserEmail());
        userDTO.setUserGender(userDO.getUserGender());
        userDTO.setUserName(userDO.getUserName());
        userDTO.setUserType(userDO.getUserType());
        userDTO.setUserPassword(userDTO.getUserPassword());
        userDTO.setUserPhoneNumber(userDTO.getUserPhoneNumber());
        return userDTO;
    }

    public static List<UserDO> convertToDOList(List<UserDTO> userDTOList) {
        List<UserDO> userDOList = Lists.newArrayList();
        for(UserDTO userDTO : userDTOList) {
            userDOList.add(convertToDO(userDTO));
        }
        return userDOList;
    }

    public static List<UserDTO> convertToDTOList(List<UserDO> userDOList) {
        List<UserDTO> userDTOList = Lists.newArrayList();
        for(UserDO userDO : userDOList) {
            userDTOList.add(convertToDTO(userDO));
        }
        return userDTOList;
    }
}
