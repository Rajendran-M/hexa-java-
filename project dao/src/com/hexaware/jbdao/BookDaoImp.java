package com.hexaware.jbdao;

import java.util.ArrayList;
import java.util.List;

import com.hexaware.journaldev.model.Book;

public class BookDaoImp implements BookDao
{
     private List<Book> books;
     
     public BookDaoImp() {
    	books = new ArrayList<>();
 	    books.add(new Book(1,"java"));
 	    books.add(new Book(2,"C++"));
 	    books.add(new Book(3,"python"));
 		
     }
     
	@Override
	public List<Book> getAllBooks() {
		return books;
		
	}

	@Override
	public Book getBookByIsbn(int isbn) {
		// TODO Auto-generated method stub
		return books.get(isbn);
	}

	@Override
	public void saveBook(Book book) {
		// TODO Auto-generated method stub
		books.add(book);
		
	}

	@Override
	public void deleteBook(Book book) {
		// TODO Auto-generated method stub
		books.remove(book);
		
		
	}
	

}
