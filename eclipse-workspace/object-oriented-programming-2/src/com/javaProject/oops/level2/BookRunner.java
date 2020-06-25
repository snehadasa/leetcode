package com.javaProject.oops.level2;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "OOPS with Java", "Sneha");
		book.addReview(new Review(10, "Great Book", 4));
		book.addReview(new Review(101, "Amazing", 4));
		
		System.out.println(book);
	}

}