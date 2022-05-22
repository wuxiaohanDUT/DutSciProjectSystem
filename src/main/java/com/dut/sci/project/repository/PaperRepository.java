package com.dut.sci.project.repository;

import com.dut.sci.project.converter.PaperConverter;
import com.dut.sci.project.domain.PaperDO;
import com.dut.sci.project.domain.PaperDOExample;
import com.dut.sci.project.dto.PaperDTO;
import com.dut.sci.project.mapper.PaperDOMapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class PaperRepository {

    @Resource
    private PaperDOMapper paperDOMapper;

    public Long addPaper(PaperDTO paperDTO) {
        if (paperDTO == null) {
            return null;
        }
        PaperDO paperDO = PaperConverter.paperDTO2DO(paperDTO);
        paperDOMapper.insert(paperDO);
        return paperDO.getPaperId();
    }

    public PaperDTO getPaperById(Long id) {
        PaperDO paperDO = paperDOMapper.selectByPrimaryKey(id);
        return PaperConverter.paperDO2DTO(paperDO);
    }

    public Boolean deleteById(Long id) {
        return paperDOMapper.deleteByPrimaryKey(id) > 0;
    }

    public List<PaperDTO> getPaperByUserId(String userId, Integer pageNum, Integer pageSize) {
        PaperDOExample paperDOExample = new PaperDOExample();
        PaperDOExample.Criteria criteria = paperDOExample.createCriteria();
        criteria.andAuthorIdsLike("%" + userId + "%");
        List<PaperDO> paperDOList = paperDOMapper.selectByExampleWithRowbounds(paperDOExample, new RowBounds((pageNum - 1) * pageSize, pageSize));
        return PaperConverter.paperDOList2DTOList(paperDOList);
    }
}
