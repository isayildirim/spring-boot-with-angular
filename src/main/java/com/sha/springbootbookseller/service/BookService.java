package com.sha.springbootbookseller.service;

import com.sha.springbootbookseller.model.Book;
import com.sha.springbootbookseller.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class BookService implements IBookService
{
    @Autowired
    private IBookRepository bookRepository;

    @Override
    public Book saveBook(Book book)
    {
        book.setCreateTime(LocalDateTime.now());
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id)
    {
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> findAllBooks()
    {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> findBookById(Long id) { return bookRepository.findById(id); }
}
