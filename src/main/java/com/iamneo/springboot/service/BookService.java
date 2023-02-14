package com.iamneo.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iamneo.springboot.model.Books;
import com.iamneo.springboot.repository.BooksRepository;

@Service
public class BookService {
	
	@Autowired
	BooksRepository booksRepository;
	public List<Books> getAllBooks(){
		List<Books> books = new ArrayList<Books>();
		booksRepository.findAll().forEach(books1->books.add(books1));
		return books;
	}
}
