package timer;

	class TV{
		String company;
		int year;
		int inch;
		
		TV(String company, int year, int inch){
			this.company = company;
			this.year = year;
			this.inch = inch;
		}
		
		void show() {
			System.out.println(company+"에서만든"+year+"년형"+inch+"TV입니다");
		}
	}




public class TvChannal {

	public static void main(String[] args) {

		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}





//LG 에서 만든 2017년형 32인치 TV