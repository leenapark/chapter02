package com.javaex.ex07;

public class Song {
	
	//필드 6개
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	//생성자 0
	public Song() {
	}
	
	//생성자 2(비교) : title, track --> 파라미터의 자료형이 달라서 사용 가능
		public Song(String title, int track) {
			this.title = title;
			
			if(track<1) {//복잡한 로직이 있을 수 잇음
				this.track = 0;
			}else {
				this.track = track;
			}
		}
	
	//생성자 6
	public Song(String title, String artist, String album, String composer, String year, int track) {
		this(title, track); //다른 생성자를 호출한다
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
	}
	//생성자 2 : title, artist
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	//생성자 2(비교) : title, composer --> 확인
	/*public Song(String title, Sting composer) {//자료형과 갯수가 겹쳐 구분이 안되어 사용할 수 없음
	}*/
	
	
	//메소드 getter/setter
	
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
	
	//메소드 일반 : showInfo()
	
	public void showInfo() {
		System.out.println(artist + ", " + title + " ( " + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡 )");
	}


	//메소드 일반 : test용 toString()
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
	

}
