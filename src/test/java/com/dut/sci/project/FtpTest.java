package com.dut.sci.project;

import com.dut.sci.project.utils.FtpUtil;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class FtpTest {

    @Resource
    private FtpUtil ftpUtil;
    @Test
    public void getFtpClientTest() {
        FTPClient ftpClient = ftpUtil.getFtpClient();
        System.out.println(ftpClient);
    }
}
