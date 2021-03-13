package com.evan.mygradution.controller;

import com.evan.mygradution.pojo.Book;
import com.evan.mygradution.pojo.User;
import com.evan.mygradution.service.BookService;
import com.evan.mygradution.service.UserService;

import com.evan.mygradution.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping("/api/users")
    public User addOrUpdate(@RequestBody User user) throws  Exception{
        userService.add(user);
        return user;
    }
    @CrossOrigin
    @GetMapping("/api/searchuser")
    public User searchResult(@RequestParam("key") String key) {
        if("".equals(key)){
            System.out.println(key);
            return null;
        }else{
            return  userService.Search(key);
        }
    }
}
