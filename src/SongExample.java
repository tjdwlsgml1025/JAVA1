	class Song{
		int year;
		String contry;
		String singer;
		String name;  //변수타입들 선언 , 인스턴스 변수들임(메모리공간을 가진 클래스 내 변수,객체의 속성)
		
		Song(int year,String contry,String singer,String name){ //매개변수들
		this.year = year;
		this.contry = contry;
		this.singer = singer;//인스턴스 변수에 매개변수 값 할당
		this.name =name;  //매개변수:메서드나 생성자에 전달되는 값으로, 해당 메서드나 생성자를 호출할 때 전달하는 인자를 받는 변수
		}  
		
		void show() { //리턴값이 필요없으니까 보이드(아무것도없음이라는뜻),계산을안하니까
			System.out.println("이 노래는" +" "+ year + "년도에" +" "+ contry+"국적의"+" "+singer+"가 부른"+name+"입니다.");
		}
	}
	
	


public class SongExample {

	public static void main(String[] args) {
		Song mySong = new Song(1978,"스웨덴","ABBA","Dancing Queen");
		mySong.show();
		
		
		Song mySong2 = new Song(2009,"한국","아이유","너랑나");
		mySong2.show();


	}

}

