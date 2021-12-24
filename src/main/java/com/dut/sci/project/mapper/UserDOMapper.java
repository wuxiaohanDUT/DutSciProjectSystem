package com.dut.sci.project.mapper;

import com.dut.sci.project.domain.UserDO;
import com.dut.sci.project.domain.UserDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDOMapper {
    long countByExample(UserDOExample example);

    int deleteByExample(UserDOExample example);

    int insert(UserDO record);

    int insertSelective(UserDO record);

    List<UserDO> selectByExample(UserDOExample example);

    int updateByExampleSelective(@Param("record") UserDO record, @Param("example") UserDOExample example);

    int updateByExample(@Param("record") UserDO record, @Param("example") UserDOExample example);
}