package com.hexaware.jbdao;

import java.util.List;

import com.hexaware.journaldev.model.Book;

public interface BookDao {
	List<Book> getAllBooks();
	Book getBookByIsbn(int isbn);
	void saveBook(Book book);
	void deleteBook(Book book);	
	

}
