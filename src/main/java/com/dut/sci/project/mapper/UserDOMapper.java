package com.dut.sci.project.mapper;

import com.dut.sci.project.domain.UserDO;
import com.dut.sci.project.domain.UserDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UserDOMapper {
    long countByExample(UserDOExample example);

    int deleteByExample(UserDOExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(UserDO record);

    int insertSelective(UserDO record);

    List<UserDO> selectByExampleWithRowbounds(UserDOExample example, RowBounds rowBounds);

    List<UserDO> selectByExample(UserDOExample example);

    UserDO selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") UserDO record, @Param("example") UserDOExample example);

    int updateByExample(@Param("record") UserDO record, @Param("example") UserDOExample example);

    int updateByPrimaryKeySelective(UserDO record);

    int updateByPrimaryKey(UserDO record);
}