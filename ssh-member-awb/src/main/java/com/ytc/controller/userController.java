package com.ytc.controller;


import com.ytc.model.Problem1;
import com.ytc.model.Problem2;
import com.ytc.model.Problem3;
import com.ytc.model.User;
import com.ytc.service.Problem1Service;
import com.ytc.service.Problem2Service;
import com.ytc.service.Problem3Service;
import com.ytc.service.UserService;
import com.ytc.util.CheckImgUtil;
import com.ytc.util.FileUtil;
import com.ytc.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class userController {
    @Autowired
   private UserService userService;
    @Autowired
    private Problem1Service problem1Service;
    @Autowired
    private Problem2Service problem2Service;
    @Autowired
    private Problem3Service problem3Service;


    /**
     * 跳转查询页面
     * @return
     */
    @RequestMapping("/toQueryUserList")
    public String toQueryUserList(){
        return "list";

    }

    /**
     * 查询
     * @param model
     * @param page
     * @return
     */

    @RequestMapping("queryUserList")
    public String queryUserList(Model model, PageUtil<User> page){
       page = userService.queryUserList(page);
        model.addAttribute("page",page);
        return "show";
    }
    /**
     * 生成验证码
     * @param request
     * @param response
     */
    @RequestMapping("imgCode")
    @ResponseBody
    public void imgCode(HttpServletRequest request, HttpServletResponse response){
        try {
            CheckImgUtil.checkImg(request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 登录方法
     * @param user
     * @param imgcode
     * @param request
     * @return
     */
    @RequestMapping("login")
    @ResponseBody
    public String login(User user, String imgcode, HttpServletRequest request){
        HttpSession session = request.getSession();
        String checkcode = (String) session.getAttribute("checkcode");
        if(!imgcode.equals(checkcode)){
            return "1";
        }
        User user1 = userService.queryUserByName(user);
        if(user1!=null){
            if( user.getUserpwd().equals(user1.getUserpwd())){
                session.setAttribute("user",user1);
                return "4";
            }else{
                return "3";
            }
        }else {
            return "2";
        }

    }

    /**
     * 跳转注册
     * @return
     */
    @RequestMapping("toReg")
    public String toReg(Model model){
        List<Problem1> problem1=  problem1Service.queryProblem1();
        List<Problem2> problem2=problem2Service.queryProblem2();
        List<Problem3> problem3=problem3Service.queryProblem3();
        model.addAttribute("problem1",problem1);
        model.addAttribute("problem2",problem2);
        model.addAttribute("problem3",problem3);
        return "regi";
    }

    /**
     * tupian
     * @param image
     * @param request
     * @return
     */
    @RequestMapping("uploadUserImg")
    @ResponseBody
    public String uploadUserImg(MultipartFile image, HttpServletRequest request){
        return FileUtil.FileUpload(image,request);
    }



}
