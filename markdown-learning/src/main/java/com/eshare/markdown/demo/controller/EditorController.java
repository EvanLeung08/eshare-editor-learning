package com.eshare.markdown.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * Created by liangyh on 2018/7/8.
 * Email:10856214@163.com
 */
@Controller
public class MarkdownController {

    @RequestMapping("/edit")
    public String markdown() {
        return "markdown_edit";
    }


}
