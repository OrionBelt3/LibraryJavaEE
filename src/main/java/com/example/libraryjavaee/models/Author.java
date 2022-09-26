package com.example.libraryjavaee.models;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"id", "name", "surname", "biography"})
public class Author {
    private long id;
    private String name;
    private String surname;
    private String biography;
}
