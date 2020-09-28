package com.ytc.service;

import com.ytc.model.User;
import com.ytc.util.PageUtil;

public interface UserService {
    PageUtil<User> queryUserList(PageUtil<User> page);

    User queryUserByName(User user);
}
