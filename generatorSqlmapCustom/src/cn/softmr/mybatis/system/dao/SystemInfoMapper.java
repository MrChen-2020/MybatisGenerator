package cn.softmr.mybatis.system.dao;

import cn.softmr.mybatis.system.module.SystemInfo;
import cn.softmr.mybatis.system.module.SystemInfoExample;
import cn.softmr.mybatis.system.module.SystemInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemInfoMapper {
    int countByExample(SystemInfoExample example);

    int deleteByExample(SystemInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemInfoWithBLOBs record);

    int insertSelective(SystemInfoWithBLOBs record);

    List<SystemInfoWithBLOBs> selectByExampleWithBLOBs(SystemInfoExample example);

    List<SystemInfo> selectByExample(SystemInfoExample example);

    SystemInfoWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemInfoWithBLOBs record, @Param("example") SystemInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") SystemInfoWithBLOBs record, @Param("example") SystemInfoExample example);

    int updateByExample(@Param("record") SystemInfo record, @Param("example") SystemInfoExample example);

    int updateByPrimaryKeySelective(SystemInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SystemInfoWithBLOBs record);

    int updateByPrimaryKey(SystemInfo record);
}