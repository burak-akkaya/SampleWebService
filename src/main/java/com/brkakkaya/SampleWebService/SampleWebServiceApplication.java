package com.brkakkaya.SampleWebService;

import com.brkakkaya.SampleWebService.entity.Book;
import com.brkakkaya.SampleWebService.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SampleWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleWebServiceApplication.class, args);
	}

	/*@Bean
	CommandLineRunner runner(BookRepository repository) {
		return args -> {
			repository.insert(Book.builder()
					.name("The Storyteller: Tales of Life and Music")
					.authorName("Dave Grohl")
					.build());
			repository.insert(Book.builder()
					.name("The Lincoln Highway: A Novel")
					.authorName("Amor Towles")
					.build());
			repository.insert(Book.builder()
					.name("The Four Winds")
					.authorName("Kristin Hannah")
					.build());
			repository.insert(Book.builder()
					.name("The Last Thing He Told Me")
					.authorName("Laura Dave")
					.build());
			repository.insert(Book.builder()
					.name("Cloud Cuckoo Land")
					.authorName("Anthony Doerr ")
					.build());

		};
	}*/

}
