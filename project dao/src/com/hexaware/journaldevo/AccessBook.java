package com.hexaware.journaldevo;
import com.hexaware.journaldev.model.Book;
import com.hexaware.jbdao.*;
public class AccessBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDao bookDao = new BookDaoImp();
		for (Book book : bookDao.getAllBooks()) {
			System.out.println(book);
		}
		  Book book = bookDao.getAllBooks().get(1);
	       // book.setBookName("Algorithms");
	      System.out.println(  bookDao.saveBook(book));

	}

}
