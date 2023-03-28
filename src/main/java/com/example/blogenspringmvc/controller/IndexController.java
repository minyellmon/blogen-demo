package com.example.blogenspringmvc.controller;

import com.example.blogenspringmvc.entity.Category;
import com.example.blogenspringmvc.entity.Post;
import com.example.blogenspringmvc.entity.Users;
import com.example.blogenspringmvc.service.CategoryService;
import com.example.blogenspringmvc.service.PostService;
import com.example.blogenspringmvc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private UsersService usersService;
    @Autowired
    private PostService postService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("allUser",
                usersService.findAllUsers());
        model.addAttribute("categories",
                categoryService.findAllCategory());
        model.addAttribute("post",new Post());
        model.addAttribute("user",new Users());
        model.addAttribute("category",new Category());
        model.addAttribute("posts",postService.findAllPost());
        return "home";
    }
}
