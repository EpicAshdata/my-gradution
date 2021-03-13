package com.evan.mygradution.controller;

import com.evan.mygradution.result.Result;
import com.evan.mygradution.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;
import org.springframework.beans.factory.annotation.Autowired;

import  com.evan.mygradution.pojo.User;
import java.util.Objects;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        // 对 html 标签进行转义，防止 XSS 攻击
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        User user = userService.get(username, requestUser.getPasswd());
//        if (!Objects.equals("admin", username) || !Objects.equals("123456", requestUser.getPasswd())) {
//            String message = "账号密码错误";
//            System.out.println("test");
//            return new Result(400);
//        } else {
//            return new Result(200);
//        }
        if (null == user) {
            return new Result(400);
        } else {
            return new Result(200);
        }
    }

}
