package com.example.Mappings.controller;

import com.example.Mappings.model.Books;
import com.example.Mappings.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksController {
    @Autowired
    BooksService bookService;

    @PostMapping(value = "/saveBooks")
    public ResponseEntity<String> saveBooks(@RequestBody Books book){
        String response = bookService.saveBooks(book);
        return new ResponseEntity<>(response , HttpStatus.CREATED);
    }
    @GetMapping(value = "/getAllBooks")
    public List<Books> getBooks(){
        return bookService.getAll();
    }
}
