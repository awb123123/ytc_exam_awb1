/**
 * Copyright (C), 2019, 因特驰
 * FileName: SessionUtil
 * Author:   zyl
 * Date:     2020/9/16 11:15
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.util;

import com.ytc.model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2020/9/16
 * @since 1.0.0
 */
public class SessionUtil {

    /**
     * 获得存储在session中的用户
     * @param request
     * @return
     */
    public static User getSessionUser(HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        return user;
    }
}
