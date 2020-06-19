package cn.besbing.Dao;

import cn.besbing.Entities.DlPermission;
import cn.besbing.Entities.DlPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DlPermissionMapper {
    long countByExample(DlPermissionExample example);

    int deleteByExample(DlPermissionExample example);

    int deleteByPrimaryKey(String permissionid);

    int insert(DlPermission record);

    int insertSelective(DlPermission record);

    List<DlPermission> selectByExample(DlPermissionExample example);

    DlPermission selectByPrimaryKey(String permissionid);

    int updateByExampleSelective(@Param("record") DlPermission record, @Param("example") DlPermissionExample example);

    int updateByExample(@Param("record") DlPermission record, @Param("example") DlPermissionExample example);

    int updateByPrimaryKeySelective(DlPermission record);

    int updateByPrimaryKey(DlPermission record);

    List<DlPermission> findPermissionByUsername(@Param("usercode") String usercode);
}