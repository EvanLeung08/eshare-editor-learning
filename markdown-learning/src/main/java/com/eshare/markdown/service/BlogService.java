package com.eshare.markdown.service;

import com.eshare.markdown.entity.Blog;

import java.util.List;

/**
 * Created by liangyh on 2018/7/8.
 * Email:10856214@163.com
 */
public interface BlogService {

    public void save(Blog blog);

    public Blog findByBlogId(Long id);

    List<Blog> findByBlogTitle(String title);
}
