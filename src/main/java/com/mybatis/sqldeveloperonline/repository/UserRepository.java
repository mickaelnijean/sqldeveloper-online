package com.mybatis.sqldeveloperonline.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserRepository {

    @Select("SELECT * FROM USERS")
    List<Users> findAll();

    @Select("SELECT * FROM USERS WHERE FIRST_NAME = #{firstName}")
    List<Users> findByFirstName(@Param("firstName") String firstName);

    @Select("SELECT * FROM ${tableName} WHERE ${constraint}")
    List<Users> findByTableNameAndConstraint(@Param("tableName") String tableName, @Param("constraint") String constraint);

    @Select("SELECT * FROM ${tableName} WHERE ${constraint}")
    List<Map<String, String>> getByTableNameAndConstraintWithAbstractType(@Param("tableName") String tableName, @Param("constraint") String constraint);
}
