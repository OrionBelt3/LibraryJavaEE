package com.example.libraryjavaee.models;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"id", "title", "author", "pages"})
public class Book {
    private long id;
    private String title;
    private String author;
    private long pages;
}
