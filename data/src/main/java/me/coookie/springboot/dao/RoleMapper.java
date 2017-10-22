package me.coookie.springboot.dao;

import me.coookie.springboot.domain.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by cookie on 2017/10/22.
 */
@Mapper
public interface RoleMapper {
    @Select("select * from ad_role where id = #{id}")
    Role getRoleMapperById(@Param("id") long id);
}
