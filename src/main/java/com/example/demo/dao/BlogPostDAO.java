package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.BlogPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostDAO extends CrudRepository<BlogPost, Long> {
    public List<BlogPost> findBlogPostById(Long id);
    public List<BlogPost> getAll();
}
