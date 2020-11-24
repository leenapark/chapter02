package com.javaex.ex03;

public class Song {
	//필드값
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//메소드 setter/getter
	//setter title
	public void setTitle(String title) {
		this.title = title;
	}
	//getter title
	public String getTitle() {
		return title;
	}
	
	//setter artist
	public void setArtist(String artist) {
		this.artist = artist;
	}
	//getter artist
	public String getArtist() {
		return artist;
	}
	
	//setter album
	public void setAlbum(String album) {
		this.album = album;
	}
	//getter album
	public String getAlbum() {
		return album;
	}
	
	//setter composer
	public void setComposer(String composer) {
		this.composer = composer;
	}
	//getter composer
	public String getComposer() {
		return composer;
	}
	
	//setter year
	public void setYear(int year) {
		this.year = year;
	}
	//getter year
	public int getYear() {
		return year;
	}
	
	//setter track
	public void setTrack(int track) {
		this.track = track;
	}
	//getter track
	public int getTrack() {
		return track;
	}
	
	public void showInfo(){
		System.out.println(artist + ", " + title + "( " + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡가" + " )");
	}
	
}
