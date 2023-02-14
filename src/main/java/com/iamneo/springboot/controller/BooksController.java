package com.iamneo.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iamneo.springboot.model.Books;
import com.iamneo.springboot.service.BookService;

@RestController
@RequestMapping("/api")
public class BooksController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/books")
	public List<Books> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	
}
