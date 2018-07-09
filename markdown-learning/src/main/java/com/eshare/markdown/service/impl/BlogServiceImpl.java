package com.eshare.markdown.service.impl;

import com.eshare.markdown.entity.Blog;
import com.eshare.markdown.repository.BlogRepository;
import com.eshare.markdown.service.BlogService;
import com.mysql.jdbc.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * 博客服务类
 * Created by liangyh on 2018/7/8.
 * Email:10856214@163.com
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;


    @Override
    public void save(Blog blog) {
        if(!StringUtils.isNullOrEmpty(blog.getContent())){
            String summary = blog.getContent().substring(0, 50);
            blog.setSummary(summary);
        }
        blogRepository.save(blog);
    }

    @Override
    public Blog findByBlogId(Long id) {
        Optional<Blog> byId = blogRepository.findById(id);
        return byId.orElse(null);
    }

    @Override
    public List<Blog> findByBlogTitle(String title) {
        return blogRepository.findByTitle(title);
    }

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }
}
