package com.dut.sci.project.service;

import com.dut.sci.project.domain.ImgDO;
import com.dut.sci.project.repository.ImgRepository;
import org.assertj.core.util.Lists;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Base64;
import java.util.List;

@Service
public class ImgService {

    @Resource
    private ImgRepository imgRepository;

    public Boolean addImgs(List<byte[]> bytes, Long formId) {
        List<ImgDO> imgDOList = Lists.newArrayList();
        for (byte[] bts : bytes) {
            ImgDO imgDO = new ImgDO();
            imgDO.setBytes(bts);
            imgDO.setFormId(formId);
            imgDOList.add(imgDO);
        }
        return imgRepository.addImgs(imgDOList);
    }

    public List<String> getImgsByFormId(Long formId) {
        List<ImgDO> imgDOList = imgRepository.getImgsByFormId(formId);
        List<String> base64List = Lists.newArrayList();
        String base64Str = "data:" + "image/png" + ";base64,";
        if (!CollectionUtils.isEmpty(imgDOList)) {
            for (ImgDO imgDO : imgDOList) {
                String content = Base64.getEncoder().encodeToString(imgDO.getBytes());
                base64List.add(base64Str + content);
            }
        }
        return base64List;
    }
}
