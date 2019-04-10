package com.zielcode.amazonviewer.model;

public class Chapter {
	
	private int id;
	private String title;
	private int duracion;
	private short year;
	private boolean viewed;
	private int timeViewed;
	private int sessionNumber;
	
	
	public Chapter(String title, int duracion, short year) {
		super();
		this.title = title;
		this.duracion = duracion;
		this.year = year;
	}
	
	

}
