package com.evan.mygradution.controller;

import com.evan.mygradution.pojo.Note;
import com.evan.mygradution.service.NoteService;

import com.evan.mygradution.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
public class NoteController {
    @Autowired
    NoteService noteService;

    @CrossOrigin
    @GetMapping("/api/notes")
    public List<Note> list() throws Exception {
        return noteService.list();
    }

    @CrossOrigin
    @PostMapping("/api/notes")
    public Note addOrUpdate(@RequestBody Note note) throws  Exception{
        noteService.addOrUpdate(note);
        return note;
    }

    @CrossOrigin
    @PostMapping("/api/notedelete")
    public  void delete(@RequestBody Note note) throws Exception{
        noteService.deleteById(note.getId());
    }
}
