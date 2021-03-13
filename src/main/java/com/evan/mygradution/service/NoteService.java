package com.evan.mygradution.service;

import com.evan.mygradution.dao.NoteDAO;
import com.evan.mygradution.pojo.Note;
import com.evan.mygradution.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NoteService {
    @Autowired
    NoteDAO noteDAO;

    @Autowired
    UserService userService;

    public List<Note> list() {
        Sort sort = Sort.by(Sort.Direction.DESC,"id");
        return noteDAO.findAll(sort);
    }

    public void addOrUpdate (Note note) {
        noteDAO.save(note);
    }

    public void deleteById(int id) {
        noteDAO.deleteById(id);
    }
}
