package com.example.demo.init;

import com.example.demo.dao.BlogPostDAO;
import com.example.demo.entity.BlogPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

@Component
public class DataInit implements ApplicationRunner {
    private BlogPostDAO blogPostDAO;

    @Autowired
    public DataInit(BlogPostDAO blogPostDAO) {
        this.blogPostDAO = blogPostDAO;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        long count = blogPostDAO.count();
 
        if (count == 0) {
            BlogPost p1 = new BlogPost();
            p1.setTitle("Первый пост");
            p1.setSubtitle("Совершенно обычный пост");
            p1.setText("Какой то текст.... бла бла");

            BlogPost p2 = new BlogPost();
            p2.setTitle("Второй пост");
            p2.setSubtitle("Не очень обычный пост");
            p2.setText("Lorem ipsum...");
 
            blogPostDAO.save(p1);
            blogPostDAO.save(p2);
        }
 
    }
     
}
