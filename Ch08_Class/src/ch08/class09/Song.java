package ch08.class09;


//필드
public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	//메서드
	public void setSongInfo(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	//결과
	public void show() {
		System.out.println("노래 제목: " + title);
		System.out.println("가수: " + artist);
		System.out.println("앨범 제목: " + album);
		System.out.println("작곡가: " + composer);
		System.out.println("발표 연도: " + year);
		System.out.println("트랙 번호: " + track);
	}
	
}
