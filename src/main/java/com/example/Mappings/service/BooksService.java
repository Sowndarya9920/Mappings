package com.example.Mappings.service;

import com.example.Mappings.model.Books;
import com.example.Mappings.repository.IBooksDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {
    @Autowired
    IBooksDao bookDao;
    public String saveBooks(Books book) {
        Books book1 = bookDao.save(book);
        return "Books saved";
    }


    public List<Books> getAll() {
        return bookDao.findAll();
    }
}
