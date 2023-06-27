package timer;

class Song{
	String title;
	String artist;
	int year;
	String contry;
	

	public Song(String title, String artist, int year, String contry) {
		super();
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.contry = contry;
	}
	
	void show() {
		System.out.println("이 노래는"+year+"년도에"+contry+"국적의"+artist+"가 부른"+title+"입니다");
	}
	
}
public class SongNew {

	public static void main(String[] args) {
		
	Song mysong = new Song("Dancing Queen","ABBA", 1978,"스웨덴");
	mysong.show();
	}

}

