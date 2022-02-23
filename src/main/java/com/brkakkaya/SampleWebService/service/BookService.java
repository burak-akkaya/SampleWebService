package com.brkakkaya.SampleWebService.service;

import com.brkakkaya.SampleWebService.repository.BookRepository;
import com.brkakkaya.SampleWebService.response.BookListResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {
    private final BookRepository repository;

    public BookListResponse getAll() {
        return BookListResponse.builder().bookList(repository.findAll()).build();
    }
}
