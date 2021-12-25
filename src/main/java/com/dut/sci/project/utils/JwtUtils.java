package com.dut.sci.project.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.CompressionCodecs;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * jwt工具类
 */
public class JwtUtils {
    /**
     * 实例
     */
    private static JwtUtils instance;

    /**
     * 发行者
     */
    private final String SUBOBJECT = "DUT_SCI_SYS";

    /**
     * 过期时间，默认7天
     */
    private final long EXPIRED = 1000 * 60 * 60 * 24 * 7;

    /**
     * 密钥
     */
    private final String SECRET = "DUT_SECRET";// 密钥

    /**
     * 获取实例
     * @return
     */
    public static JwtUtils getInstance(){
        if (instance == null){
            instance = new JwtUtils();
        }
        return instance;
    }

    /**
     * 生成 jwt token
     * @return
     */
    public String generateToken(Map<String, Object> claims) {
        String token = Jwts.builder()
                .setClaims(claims)
                .setSubject(SUBOBJECT) // 发行者
                .setId(UUID.randomUUID().toString()) // 设置jti(JWT ID)：是JWT的唯一标识，从而回避重放攻击
                .setIssuedAt(new Date()) // 发行时间
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRED))
                .signWith(SignatureAlgorithm.HS256, SECRET) // 签名类型 与 密钥
                .compressWith(CompressionCodecs.DEFLATE)// 对载荷进行压缩
                .compact(); // 压缩一下
        return token;
    }

    /**
     * 解析 token
     * @param token
     * @return
     */
    public Map<String, Object> check(String token){
        try{
            final Claims claims = Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token)
                    .getBody();
            return claims;
        }catch (Exception e){}
        return null;
    }

}