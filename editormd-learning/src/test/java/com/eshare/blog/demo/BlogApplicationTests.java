package com.eshare.blog.demo;

import com.eshare.blog.BlogApplication;
import com.eshare.blog.controller.BlogController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {BlogController.class})
public class BlogApplicationTests {

	private MockMvc mvc ;


	@Before
	public void setUp(){
		mvc = MockMvcBuilders.standaloneSetup(new BlogApplication()).build();
	}

	@Test
	public void getHello() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/edit").accept(MediaType.TEXT_HTML_VALUE)).andExpect(MockMvcResultMatchers.view().name("edit"));
	}

}
