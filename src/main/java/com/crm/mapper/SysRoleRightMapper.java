package com.crm.mapper;

import com.crm.bean.SysRoleRightExample;
import com.crm.bean.SysRoleRightKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleRightMapper extends IBaseMapper<SysRoleRightKey>{
    int countByExample(SysRoleRightExample example);

    int deleteByExample(SysRoleRightExample example);

    int deleteByPrimaryKey(SysRoleRightKey key);

    int insert(SysRoleRightKey record);

    int insertSelective(SysRoleRightKey record);

    List<SysRoleRightKey> selectByExample(SysRoleRightExample example);

    int updateByExampleSelective(@Param("record") SysRoleRightKey record, @Param("example") SysRoleRightExample example);

    int updateByExample(@Param("record") SysRoleRightKey record, @Param("example") SysRoleRightExample example);
}