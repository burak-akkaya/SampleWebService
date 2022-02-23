package com.brkakkaya.SampleWebService.response;

import com.brkakkaya.SampleWebService.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class BookListResponse {
    private List<Book> bookList;
}
