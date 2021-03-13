package com.evan.mygradution.service;

import com.evan.mygradution.dao.UserDAO;
import com.evan.mygradution.pojo.Book;
import com.evan.mygradution.pojo.Category;
import com.evan.mygradution.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

    public boolean isExist(String username) {
        User user = getByName(username);
        return null!=user;
    }

    public User getByName(String username) {
        return userDAO.findByUsername(username);
    }

    public User get(String username, String passwd){
        return userDAO.getByUsernameAndPasswd(username, passwd);
    }

    public void add(User user) {
        userDAO.save(user);
    }

    public List<User> list() {
        Sort sort = Sort.by(Sort.Direction.DESC,"id");
        return userDAO.findAll(sort);
    }

    public User get(int id){
        User u = userDAO.findById(id).orElse(null);
        return u;
    }
    public  User Search(String key){
        return userDAO.findByUsername(key);
    }
}