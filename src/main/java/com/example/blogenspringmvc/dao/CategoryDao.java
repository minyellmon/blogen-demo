package com.example.blogenspringmvc.dao;

import com.example.blogenspringmvc.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category,Integer> {
}
