package com.gczhu.mapper;

import com.gczhu.dto.DtoUser;
import com.gczhu.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;


public interface UserMapper {
    //查询
    @Select("select * from user where id=#{id}" )
    public User selectOne(@Param("id") Integer id);

    public List<User> selectList();
    public List<User> selectListByDepartId(Integer departId);



    @Select("select * from user where id=#{id}" )
    public Map<Integer,String> selectOneByidReturnMap(Integer id);

    @Select("select * from user" )
    @MapKey("id")
    public Map<Integer,User> selectAllReturnMap();

    public DtoUser selectOneDtoUserbyId(Integer id);//测试resultMap


    public void addUser(User user);

    //更新
    public int updateUser(User user);

    //删除
    @Delete("delete from user where id=#{id}")
    public int deleteUserById(Integer id);
}
