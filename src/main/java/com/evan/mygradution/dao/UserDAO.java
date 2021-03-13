package com.evan.mygradution.dao;

import com.evan.mygradution.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,Integer> {
    User findByUsername(String username);

    User getByUsernameAndPasswd(String username,String passwd);
}

