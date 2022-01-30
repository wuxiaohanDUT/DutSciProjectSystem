package com.dut.sci.project.service;

import com.dut.sci.project.dto.UserDTO;
import com.dut.sci.project.repository.UserRepository;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    public UserDTO userLogin(Long userId, String passWord) {
        UserDTO userDTO = userRepository.getUserDTOById(userId);
        if (userDTO == null || !userDTO.getUserPassword().equals(passWord)) {
            return null;
        }
        return userDTO;
    }

    public Boolean changePassword(Long userId, String newPassword) {
        UserDTO userDTO = userRepository.getUserDTOById(userId);
        if (userDTO.getUserPassword().equals(newPassword) || Strings.isBlank(newPassword)) {
            return false;
        }
        userDTO.setUserPassword(newPassword);
        return userRepository.updateUserInfo(userDTO);
    }
    public Boolean userInfoUpdate(UserDTO userDTO) {
        return userRepository.updateUserInfo(userDTO);
    }

    public UserDTO getUserInfoById(Long userId) {
        UserDTO userDTO = userRepository.getUserDTOById(userId);
        userDTO.setUserPassword(null);
        return userDTO;
    }

    public List<String> getAllCollege() {
        return userRepository.getAllCollege();
    }
}
