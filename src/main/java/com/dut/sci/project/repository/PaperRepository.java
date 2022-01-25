package com.dut.sci.project.repository;

import com.dut.sci.project.converter.PaperConverter;
import com.dut.sci.project.domain.PaperDO;
import com.dut.sci.project.dto.PaperDTO;
import com.dut.sci.project.mapper.PaperDOMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class PaperRepository {

    @Resource
    private PaperDOMapper paperDOMapper;

    public Boolean addPaper(PaperDTO paperDTO) {
        if (paperDTO == null) {
            return false;
        }
        PaperDO paperDO = PaperConverter.paperDTO2DO(paperDTO);
        return paperDOMapper.insert(paperDO) > 0;
    }

    public PaperDTO getPaperById(Long id) {
        PaperDO paperDO = paperDOMapper.selectByPrimaryKey(id);
        return PaperConverter.paperDO2DTO(paperDO);
    }

    public Boolean deleteById(Long id) {
        return paperDOMapper.deleteByPrimaryKey(id) > 0;
    }
}
