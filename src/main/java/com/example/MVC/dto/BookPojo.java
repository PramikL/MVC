package com.example.MVC.dto;

import com.example.MVC.entity.Book;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookPojo {
    private Integer id;
    private  String name;
    private String author;
    private Double price;

    public BookPojo(Book book){
        this.id = book.getId();
        this.name = book.getName();
        this.author = book.getAuthor();
        this.price = book.getPrice();


    }

}
