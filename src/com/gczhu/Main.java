package com.gczhu;

import com.gczhu.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStream in = Resources.getResourceAsStream("com/gczhu/mybatis-config/mybatis.xml");
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = ssf.openSession();
        List<User> list = sqlSession.selectList("user.select");
        System.out.println(list.toString());
    }
}
