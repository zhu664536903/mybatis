package com.gczhu.test;

import com.gczhu.mapper.UserMapper;
import com.gczhu.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStream in = Resources.getResourceAsStream("com/gczhu/mybatis-config/mybatis.xml");
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = ssf.openSession(true);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //测试查询一条记录
        System.out.println(userMapper.selectOne(1));
        //查询单条记录返回map类型
        System.out.println(userMapper.selectOneByidReturnMap(1));
        //更新一条记录
        User user = new User(null,"关2羽","男",new Date());
        userMapper.addUser(user);
        user.setId(2);
        System.out.println("更新记录数为："+userMapper.updateUser(user));

        //删除一条记录
        userMapper.deleteUserById(4);
        sqlSession.close();


    }
}
