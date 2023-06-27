//static변수= 공유변수 = class변수 = 정적변수
class InstCnt{
	static int instNum = 0; //클래스 변수(static변수) = 먼저(객체생성보다) 올려 공유(어디에다?method area)=계속참조사용가능(메모리상에상주)
	//
	InstCnt(){
		instNum++;
		System.out.println("인스턴스생성:"+instNum);
	}
}



public class Static1 {
	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt(); //static안했으면 전부 다 1이될거임
		InstCnt cnt2 = new InstCnt(); //static으로 메모리에 이미 올라가있으니까 원래있떤값에+1해서 2가됨
		InstCnt cnt3 = new InstCnt();
		
		
		System.out.println(InstCnt.instNum); //객체선언안했지만 스태틱변수라 바로접근할수있음
											//(클래스명.스태틱변수명)=클래스명>클래스전부를스캔함,변수명>발견, 뽑아냄
											//.을 넣는 이유=클래스니까! 
		
		System.out.println(InstCnt.instNum++); // = 0 초기화 된 값이 나오니까
		System.out.println(InstCnt.instNum); 	// = 1 왜??
	
	}

}
