package com.brkakkaya.SampleWebService.controller;

import com.brkakkaya.SampleWebService.response.BookListResponse;
import com.brkakkaya.SampleWebService.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/sample/book")
@AllArgsConstructor
public class BooksController {
    private final BookService bookService;

    @GetMapping("/all")
    public ResponseEntity<BookListResponse> all(){
        return ResponseEntity.ok(bookService.getAll());
    }

}
