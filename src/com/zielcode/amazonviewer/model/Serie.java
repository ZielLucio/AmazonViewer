package com.zielcode.amazonviewer.model;

public class Serie extends Film {
	
	private int id;
	private int sessionQuantity;
	private Chapter[] chapters;
	
	
	public Serie(String title, String genre, String creator, int duracion, int sessionQuantity) {
		super(title, genre, creator, duracion);
		// TODO Auto-generated constructor stub
		this.sessionQuantity = sessionQuantity;
		
	}
	

	public int getId() {
		return id;
	}


	public int getSessionQuantity() {
		return sessionQuantity;
	}


	public void setSessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}


	public Chapter[] getChapters() {
		return chapters;
	}


	public void setChapters(Chapter[] chapters) {
		this.chapters = chapters;
	}

	
	

}
