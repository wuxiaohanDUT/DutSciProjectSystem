package com.dut.sci.project.service;

import com.dut.sci.project.dto.UserDTO;
import com.dut.sci.project.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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

    public Boolean userInfoUpdate(UserDTO userDTO) {
        return userRepository.updateUserInfo(userDTO);
    }
}
