package com.bangmacblog.service;

import com.bangmacblog.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);}
