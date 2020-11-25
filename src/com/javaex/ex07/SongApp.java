package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {
		
		// 생성자 Song()
		// setter 사용
		// toString() test 확인
		// showInfo() 출력
		
		Song songInfo1 = new Song();
		
		songInfo1.setTitle("좋은 날");
		songInfo1.setArtist("아이유");
		songInfo1.setAlbum("Real");
		songInfo1.setComposer("이민수");
		songInfo1.setYear("2010");
		songInfo1.setTrack(3);
		System.out.println(songInfo1.toString());
		songInfo1.showInfo();
		
		System.out.println("=================================");
		
		// 생성자 Song(String title, String artist, String album, String composer, String year, int track)
		// setter 사용 X
		// toString() test 확인
		// showInfo() 출력
		
		Song songInfo2 = new Song("거짓말", "BIGBANG", "Always", "G-DRAGON", "2007", 2);
		System.out.println(songInfo2.toString());
		songInfo2.showInfo();
		
		// 생성자 Song(String title, String artist)
		// setter 사용 : setAlbum, setComposer, setYear, setTrack
		// toString() test 확인
		// showInfo() 출력
		
		System.out.println("=================================");
		
		Song songInfo3 = new Song("벚꽃 엔딩", "버스커버스커");
		songInfo3.setAlbum("버스커버스커1집");
		songInfo3.setComposer("장범준");
		songInfo3.setYear("2012");
		songInfo3.setTrack(4);
		System.out.println(songInfo3.toString());
		songInfo3.showInfo();
		
		
		System.out.println("=================================");
		
		
		// 생성자 Song(String title, int track)
		// setter 사용 : setArtist, setAlbum, setComposer, setYear
		// toString() test 확인
		// showInfo() 출력
		Song songInfo4 = new Song("도망가자 (Run With Me)", 2);
		songInfo4.setArtist("선우정아");
		songInfo4.setAlbum("Serenade");
		songInfo4.setComposer("선우정아");
		songInfo4.setYear("2019");
		System.out.println(songInfo4.toString());
		songInfo4.showInfo();
		
	}

}
