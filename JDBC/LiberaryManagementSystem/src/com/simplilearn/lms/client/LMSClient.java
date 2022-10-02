package com.simplilearn.lms.client;

import com.simplilearn.lms.book.Book;
import com.simplilearn.lms.service.BookService;

public class LMSClient {

	public static void main(String[] args) {
		
		BookService bookService = new BookService();
		/*1. Verify the Users*/
		//String status=bookService.verifyUsers("admin","admin@1234");
		//String status=bookService.verifyUsers("admi","admin@1234"); // wrong user name
		//System.out.println(status);
		
		
		/*2. Add The BOOK*/
		Book book = new Book(901,"Java: The Complete Reference, Seventh Edition","Herbert Schildt","McGraw Hill Education",550,007063677);
		
		int record=bookService.addBook(book);
		if(record>0) {
			System.out.println("Book Inserted Successfully");
		}else {
			System.err.println("Error Occured while Inserting the Book Details ");
		}
		
		// Home Work 
		/*3. Update The Books Details */
		
		
		/*4. Delete The Books Details */
		
	}
}
