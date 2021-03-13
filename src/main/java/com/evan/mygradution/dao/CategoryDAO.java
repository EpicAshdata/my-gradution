package com.evan.mygradution.dao;

import com.evan.mygradution.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDAO extends JpaRepository<Category,Integer>{
}
