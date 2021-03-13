package com.evan.mygradution.dao;

import com.evan.mygradution.pojo.Book;
import com.evan.mygradution.pojo.Category;
import com.evan.mygradution.pojo.Note;
import com.evan.mygradution.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface NoteDAO extends JpaRepository<Note,Integer> {
    List<Note> findAllByUser(User user);
    List<Note> findAllByTitleLikeOrAuthor(String key1, String key2);
}
