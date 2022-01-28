package com.dut.sci.project.repository;

import com.dut.sci.project.domain.ImgDO;
import com.dut.sci.project.domain.ImgDOExample;
import com.dut.sci.project.mapper.ImgDOMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class ImgRepository {

    @Resource
    private ImgDOMapper imgDOMapper;

    public Boolean addImgs(List<ImgDO> imgDOList) {
        if (imgDOList == null) {
            return false;
        }
        boolean success = true;
        for (ImgDO imgDO : imgDOList) {
            success &= imgDOMapper.insert(imgDO) > 0;
        }
        return success;
    }

    public List<ImgDO> getImgsByFormId(Long formId) {
        ImgDOExample imgDOExample = new ImgDOExample();
        ImgDOExample.Criteria criteria = imgDOExample.createCriteria();
        criteria.andFormIdEqualTo(formId);
        List<ImgDO> imgDOList = imgDOMapper.selectByExample(imgDOExample);
        if (CollectionUtils.isEmpty(imgDOList)) {
            return null;
        }
        return imgDOList;
    }

    public Boolean deleteImgByFormId(Long formId) {
        ImgDOExample example = new ImgDOExample();
        ImgDOExample.Criteria criteria = example.createCriteria();
        criteria.andFormIdEqualTo(formId);
        return imgDOMapper.deleteByExample(example) >= 0;
    }
}
