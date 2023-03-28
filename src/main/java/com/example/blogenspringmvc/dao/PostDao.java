package com.example.blogenspringmvc.dao;

import com.example.blogenspringmvc.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostDao extends JpaRepository<Post,Integer> {
}
