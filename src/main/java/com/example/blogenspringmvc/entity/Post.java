package com.example.blogenspringmvc.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    @Column(columnDefinition = "text")
    private String body;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate datePosted;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Users users;











}
