package com.brkakkaya.SampleWebService.repository;

import com.brkakkaya.SampleWebService.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
