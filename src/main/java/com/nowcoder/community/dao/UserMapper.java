package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/*mapper 注解bean'*/
@Repository
@Mapper
public interface UserMapper {
/*根据id查询返回整个user的信息 返回一个类*/
    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);
/*返回插入数据的行数 插入的是整个user对象*/
    int insertUser(User user);
/*返回的是一个更新的id和状态*/
    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);

}
