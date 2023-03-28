package com.example.blogenspringmvc.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate datePosted;
    @OneToMany(mappedBy = "category")
    private List<Post>  postList=
            new ArrayList<>();

    public void addPost(Post post){
        post.setCategory(this);
        this.postList.add(post);
    }









}
