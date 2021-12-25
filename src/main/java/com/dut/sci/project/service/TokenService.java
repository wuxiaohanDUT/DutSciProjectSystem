package com.dut.sci.project.service;

import com.dut.sci.project.utils.JwtUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TokenService {

    private static JwtUtils jwtUtils = JwtUtils.getInstance();

    public String generateUserToken(Long userID) {
        Map<String, Object> map = new HashMap<>();
        map.put("userID", userID.toString());
        return jwtUtils.generateToken(map);
    }

    public Boolean validateUserToken(String token, Long userID) {
        Map<String, Object> map = jwtUtils.check(token);
        if (null == map ) {
            return false;
        }
        String tokenUserId = (String) map.get("userID");
        if (tokenUserId == null || !tokenUserId.equals(userID.toString())) {
            return false;
        }
        return true;
    }
}
