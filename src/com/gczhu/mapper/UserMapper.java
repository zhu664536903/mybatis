package com.gczhu.mapper;

import com.gczhu.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UserMapper {
    //查询
    @Select("select * from user where id=#{id}")
    public User selectOne(@Param("id") Integer id);

    public List<User> selectList();

    public void addUser(User user);

    //更新
    public int updateUser(User user);

    //删除
    @Delete("delete from user where id=#{id}")
    public int deleteUserById(Integer id);
}
