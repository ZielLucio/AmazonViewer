package com.zielcode.amazonviewer.model;

public class Serie {
	private int id;
	private String title;
	private String genre;
	private String creator;
	private int duracion;
	private short year;
	private boolean viewed;
	private int timeViewed;
	
	private int sessionQuantity;
	//chapters[]

	public Serie(String title, String genre, int duracion) {
		super();
		this.title = title;
		this.genre = genre;
		this.duracion = duracion;
	}
	
	

}
