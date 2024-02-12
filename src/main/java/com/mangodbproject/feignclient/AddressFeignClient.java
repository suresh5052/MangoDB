package com.mangodbproject.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.mangodbproject.Dto.Book;

@FeignClient(name = "book-service", url = "localhost:8080/api/books")
public interface AddressFeignClient {

	@GetMapping("/getAllBooks")
	List<Book> getAllBooks();
}
