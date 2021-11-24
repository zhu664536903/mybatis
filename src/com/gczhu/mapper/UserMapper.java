package com.gczhu.mapper;

import com.gczhu.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {
    public User selectOne(@Param("id") Integer id);
    public List<User> selectList();
}
