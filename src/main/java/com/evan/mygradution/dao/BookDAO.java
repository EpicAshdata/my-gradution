package com.evan.mygradution.dao;

import com.evan.mygradution.pojo.Category;
import com.evan.mygradution.pojo.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookDAO extends JpaRepository<Book,Integer>{
    List<Book> findAllByCategory(Category category);
    List<Book> findAllByTitleLikeOrAuthor(String key1,String key2);
}
