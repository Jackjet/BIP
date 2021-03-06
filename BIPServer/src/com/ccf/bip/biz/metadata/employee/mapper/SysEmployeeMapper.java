package com.ccf.bip.biz.metadata.employee.mapper;

import java.util.HashMap;
import java.util.List;

public interface SysEmployeeMapper {
    int deleteByPrimaryKey(String employeeId);

    int insert(SysEmployee record);

    int insertSelective(SysEmployee record);

    SysEmployee selectByPrimaryKey(String employeeId);

    List<HashMap<String,Object>> selectByPostId(String roleId);

    List<SysEmployee> recursiveSelectByOrgId(String orgId);
    
    List<HashMap<String,Object>> recursiveSingleSelectByOrgId(String orgId);

    List<HashMap<String,Object>> selectWithAccount(String orgId);

    int updateByPrimaryKeySelective(SysEmployee record);

    int updateByPrimaryKeyWithBLOBs(SysEmployee record);

    int updateByPrimaryKey(SysEmployee record);
}