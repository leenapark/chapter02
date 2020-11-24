package com.javaex.ex03;

public class Song {
	
	
	//필드값
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	//생성자
	//생성자는 작명을 할 수 없다 클래스 이름과 같아야 한다
	//생성자는 리턴 형이 없다 있다가 없다가가 아니라 아예 없음
	//생성자는 메소드와 유사하다
	
	public Song(String title, String artist, String album, String composer, String year, int track) {
		//이 부분이 메모리에 올라간다
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	public Song() {
		//이 부분이 메모리에 올라간다
	}
	
	
	/*
	//메소드 setter/getter
	//setter title
	public void setTitle(String title) {//결과값을 따로 알려줄 필요가 없어서 void 사용
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
	public void setYear(String year) {
		this.year = year;
	}
	//getter year
	public String getYear() {
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
	
		
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}
	*/
	
	public void showInfo(){
		System.out.println(artist + ", " + title + "( " + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡" + " )");
	}	
}
