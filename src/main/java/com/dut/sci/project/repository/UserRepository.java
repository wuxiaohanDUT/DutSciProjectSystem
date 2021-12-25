package com.dut.sci.project.repository;

import com.dut.sci.project.converter.UserConverter;
import com.dut.sci.project.domain.UserDO;
import com.dut.sci.project.domain.UserDOExample;
import com.dut.sci.project.domain.UserDOWithBLOBs;
import com.dut.sci.project.dto.UserDTO;
import com.dut.sci.project.mapper.UserDOMapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class UserRepository {

    @Resource
    private UserDOMapper userDOMapper;

    public UserDTO getUserDTOById(Long userId) {
        UserDO userDO = userDOMapper.selectByPrimaryKey(userId);
        if (null == userDO) {
            return null;
        }
        return UserConverter.convertToDTO(userDO);
    }

    public List<UserDTO> getUserDTOListByIds(List<Long> userIds, Integer limit, Integer offset) {
        UserDOExample userDOExample = new UserDOExample();
        UserDOExample.Criteria criteria = userDOExample.createCriteria();
        criteria.andUserIdIn(userIds);
        RowBounds rowBounds = new RowBounds(limit, offset);
        List<UserDO> userDOList = userDOMapper.selectByExampleWithRowbounds(userDOExample, rowBounds);
        if (CollectionUtils.isEmpty(userDOList)) {
            return null;
        }
        return UserConverter.convertToDTOList(userDOList);
    }

    public Boolean updateUserInfo(UserDTO userDTO) {
        UserDO userDO = UserConverter.convertToDO(userDTO);
        return userDOMapper.updateByPrimaryKeySelective(userDO) != 0;
    }
}
