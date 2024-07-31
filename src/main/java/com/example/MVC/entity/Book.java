package com.example.MVC.entity;

import jakarta.persistence.*;
import lombok.*;

import javax.annotation.processing.Generated;
@Entity
@Table(name="book")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String author;
    private Double price;
}
