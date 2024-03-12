package com.example.prog3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//create rest controller
@RestController
@RequestMapping("/book")
public class BookControler {
	List<Book> blist = new ArrayList<Book>();
	
	@GetMapping
	public List<Book> getBooks(){
		return blist;
	}
	
	@PostMapping
	public List<Book> postBook(@RequestBody Book book){
		blist.add(book);
		return blist;
	}
	
	 
	

}
