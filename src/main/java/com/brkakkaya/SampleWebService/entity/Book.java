package com.brkakkaya.SampleWebService.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@Builder
public class Book {
    @Id
    private String id;

    private String name;
    private String authorName;
    private String description;
}
