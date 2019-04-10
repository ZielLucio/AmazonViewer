package com.zielcode.amazonviewer.model;

import java.util.Date;

public class Book {
	
	private int id;
	private String tittle;
	private Date editionDate;
	private String editorial;
	private String[] autors;
	private String isbn;
	private boolean reader;
	private int timeReader;
	
	
	
	public Book(String tittle, Date editionDate, String editorial, String isbn) {
		super();
		this.tittle = tittle;
		this.editionDate = editionDate;
		this.editorial = editorial;
		this.isbn = isbn;
	}
	
	

}
