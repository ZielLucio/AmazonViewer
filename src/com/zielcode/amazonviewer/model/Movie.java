package com.zielcode.amazonviewer.model;

public class Movie {
	
	public int id;
	private String title;
	private String genre;
	private String creator;
	private int duracion;
	private short year;
	private boolean viewed;
	private int timeViewed;
	
	
	
	
	public Movie(String title, String genre, String creator, int duracion, short year) {
		super();
		this.title = title;
		this.genre = genre;
		this.creator = creator;
		this.duracion = duracion;
		this.year = year;
	}




	public Movie(String title, String genre, short year) {
		super();
		this.title = title;
		this.genre = genre;
		this.year = year;
	}
	
	public void showData() {
		System.out.println("Tittle: "+ title);
		System.out.println("Genre: "+ genre);
		System.out.println("Year: "+ year);
		
	}

}
