package com.dut.sci.project.mapper;

import com.dut.sci.project.domain.ImgDO;
import com.dut.sci.project.domain.ImgDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ImgDOMapper {
    long countByExample(ImgDOExample example);

    int deleteByExample(ImgDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ImgDO record);

    int insertSelective(ImgDO record);

    List<ImgDO> selectByExampleWithBLOBsWithRowbounds(ImgDOExample example, RowBounds rowBounds);

    List<ImgDO> selectByExampleWithBLOBs(ImgDOExample example);

    List<ImgDO> selectByExampleWithRowbounds(ImgDOExample example, RowBounds rowBounds);

    List<ImgDO> selectByExample(ImgDOExample example);

    ImgDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ImgDO record, @Param("example") ImgDOExample example);

    int updateByExampleWithBLOBs(@Param("record") ImgDO record, @Param("example") ImgDOExample example);

    int updateByExample(@Param("record") ImgDO record, @Param("example") ImgDOExample example);

    int updateByPrimaryKeySelective(ImgDO record);

    int updateByPrimaryKeyWithBLOBs(ImgDO record);

    int updateByPrimaryKey(ImgDO record);
}