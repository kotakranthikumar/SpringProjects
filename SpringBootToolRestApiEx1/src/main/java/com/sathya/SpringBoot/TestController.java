package com.sathya.SpringBoot;

import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
public class TestController {

	@GetMapping("/test")
	public String wish() {

		return "Hello ! This is Rest Class";
	}

	@GetMapping("/wish/{name}")
	public String greet(@PathVariable String name) {
		return "Good Morning...." + name;
	}

	@GetMapping("/info")
	public String info(@RequestParam String name) {
		return name + "Kranthi is good Boy....";
	}

	@GetMapping("/book")
	public Books getoBook() {
		return new Books(1001, "java", "jamess", 400.0);
	}

	@GetMapping("/books")
	public List<Books> getBook() {
		List<Books> books = List.of(new Books(1001, "java", "james gosling", 400),
				new Books(1002, "Spring", "Kranthi", 600), new Books(1002, "spring", "ewrtyu", 500));
		return books;

	}

}
