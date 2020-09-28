package com.ytc.service;

import com.ytc.mapper.UserMapper;
import com.ytc.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ytc.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    public PageUtil<com.ytc.model.User> queryUserList(PageUtil<User> page) {
        long count=userMapper.queryCount();
        page=new PageUtil<User>(page.getCpage(),count,page.getPageSize());
        List<User> list=userMapper.querUser(page.getStart(),page.getPageSize());
        page.setList(list);
        return page;
    }

    public User queryUserByName(User user) {

        return  userMapper.queryUserByName(user);
    }
}
