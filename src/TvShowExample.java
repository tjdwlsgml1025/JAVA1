class TV {
	String brand;
	int year;
	int inch;

	TV(String brand, int year, int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}

	void show() {
		System.out.println(brand + "에서만든" + year + "년형" + inch + "인치TV"); // 프린트해줄쇼함수만들기
	}

}

public class TvShowExample {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32); // 세개의 데이터타입에 대한 함수필요
		myTV.show(); // 쇼에 대한 함수필요
		// LG 에서 만든 2017년형 32인치 TV
	}

}