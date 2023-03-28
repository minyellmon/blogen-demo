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
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateRegistered;
    @OneToMany(mappedBy = "users")
    private List<Post> postList=
            new ArrayList<>();
    public void addPost(Post post){
        post.setUsers(this);
        postList.add(post);
    }
}
