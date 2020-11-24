package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//메인
		Song songInfo1 = new Song();
		
		//songTitle
		songInfo1.setTitle("좋은 날");
		String title1 = songInfo1.getTitle();
		//songArtist
		songInfo1.setArtist("아이유");
		String artist1 = songInfo1.getArtist();
		//songAlbum
		songInfo1.setAlbum("Real");
		String album1 = songInfo1.getAlbum();
		//songComposer
		songInfo1.setComposer("이민수");
		String composer1 = songInfo1.getComposer();
		//songYear
		songInfo1.setYear(2010);
		int year1 = songInfo1.getYear();
		//songTrack
		songInfo1.setTrack(3);
		int track1 = songInfo1.getTrack();
		
		songInfo1.showInfo();
		
		Song songInfo2 = new Song();
		
		//songTitle
		songInfo2.setTitle("거짓말");
		String title2 = songInfo2.getTitle();
		//songArtist
		songInfo2.setArtist("BIGBANG");
		String artist2 = songInfo2.getArtist();
		//songAlbum
		songInfo2.setAlbum("Always");
		String album2 = songInfo2.getAlbum();
		//songComposer
		songInfo2.setComposer("G-DRAGON");
		String composer2 = songInfo2.getComposer();
		//songYear
		songInfo2.setYear(2007);
		int year2 = songInfo2.getYear();
		//songTrack
		songInfo2.setTrack(2);
		int track2 = songInfo2.getTrack();
		
		songInfo2.showInfo();
		
		Song songInfo3 = new Song();
		
		//songTitle
		songInfo3.setTitle("벚꽃 엔딩");
		String title3 = songInfo3.getTitle();
		//songArtist
		songInfo3.setArtist("버스커버스커");
		String artist3 = songInfo3.getArtist();
		//songAlbum
		songInfo3.setAlbum("버스커버스커1집");
		String album3 = songInfo3.getAlbum();
		//songComposer
		songInfo3.setComposer("장범준");
		String composer3 = songInfo3.getComposer();
		//songYear
		songInfo3.setYear(2012);
		int year3 = songInfo3.getYear();
		//songTrack
		songInfo3.setTrack(4);
		int track3 = songInfo3.getTrack();
		
		songInfo3.showInfo();
		
	}

}
