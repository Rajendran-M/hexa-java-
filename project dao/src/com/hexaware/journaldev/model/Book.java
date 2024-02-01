
package com.hexaware.journaldev.model;

public class Book {
	private int isbn;
	private String bookName;
	
	public  Book() {
				
	}
	
	public Book (int isbn,String name) {
		this.isbn = isbn;
		this.bookName =name;
		
	}
	public String toString() {
		return isbn +" "+bookName; 
	}

}
