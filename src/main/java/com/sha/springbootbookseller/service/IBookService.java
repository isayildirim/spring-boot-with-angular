package com.sha.springbootbookseller.service;

import com.sha.springbootbookseller.model.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {
    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBooks();

    Optional<Book> findBookById(Long id);
}
