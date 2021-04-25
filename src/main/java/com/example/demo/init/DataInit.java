package com.example.demo.init;

import com.example.demo.dao.BlogPostDAO;
import com.example.demo.entity.BlogPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Component
public class DataInit implements ApplicationRunner {
    private BlogPostDAO blogPostDAO;

    private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    @Autowired
    public DataInit(BlogPostDAO blogPostDAO) {
        this.blogPostDAO = blogPostDAO;
    }

    @Override
    public void run(ApplicationArguments)

}
