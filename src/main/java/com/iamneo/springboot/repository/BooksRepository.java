package com.iamneo.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.iamneo.springboot.model.Books;

public interface BooksRepository extends CrudRepository<Books, Integer> {

}
