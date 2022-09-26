package com.example.libraryjavaee.models;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"id", "name", "surname", "age"})
public class User {
    private long id;
    private String name;
    private String surname;
    private int age;
}
