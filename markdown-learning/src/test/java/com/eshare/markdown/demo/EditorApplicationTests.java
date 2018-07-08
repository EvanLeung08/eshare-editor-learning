package com.eshare.markdown.demo;

import com.eshare.markdown.EditorApplication;
import com.eshare.markdown.controller.EditorController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {EditorController.class})
public class EditorApplicationTests {

	private MockMvc mvc ;


	@Before
	public void setUp(){
		mvc = MockMvcBuilders.standaloneSetup(new EditorApplication()).build();
	}

	@Test
	public void getHello() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/edit").accept(MediaType.TEXT_HTML_VALUE)).andExpect(status().isOk()).andExpect(content().string(equalTo("edit")));
	}

}
