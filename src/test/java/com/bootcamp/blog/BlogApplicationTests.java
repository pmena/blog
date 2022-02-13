package com.bootcamp.blog;

import com.bootcamp.blog.repositories.AuthorRepository;
import com.bootcamp.blog.services.AuthorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = {AuthorRepository.class, AuthorService.class})
class BlogApplicationTests {

	@Autowired
	private MockMvc mvc;

	@Test
	void LeerAutor() throws Exception {
		int id = 1;
		mvc.perform( MockMvcRequestBuilders
				.get("/author/"+id)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}



}
