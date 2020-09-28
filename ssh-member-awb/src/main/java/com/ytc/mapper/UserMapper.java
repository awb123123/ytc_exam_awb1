package com.ytc.mapper;

import com.ytc.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    long queryCount();


    List<User> querUser(@Param("start") int start, @Param("pageSize") int pageSize);

    User queryUserByName(User user);
}