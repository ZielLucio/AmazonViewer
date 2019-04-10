package com.zielcode.amazonviewer.model;

import java.util.Date;

public class Magazine {
	private int id;
	private String tittle;
	private Date editionDate;
	private String editorial;
	private String[] autors;
	
	
	public Magazine(String tittle, Date editionDate, String editorial) {
		super();
		this.tittle = tittle;
		this.editionDate = editionDate;
		this.editorial = editorial;
	}
	
	

}
