package com.spring.boot.DemoSpringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.DemoSpringBoot.vo.Books;

@RestController
public class DemoController {
	
	@GetMapping("/books")
	public List<Books> getAllBooks(){
		
		return Arrays.asList(new Books(1,"Java Concurrency 20", "Unknown"));
	}

}
