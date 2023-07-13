package timer;

class GetSum{
	int num;
	
	void setNum(int num1) {
	num=num1;
	}
	
	int sum() {
		int sum=0;
		for(int i=1; i<=num;i++) {
			sum=sum+i;
		}
		return sum;
	}
}

public class Star3 {

	public static void main(String[] args) {
		GetSum getsum = new GetSum();
        int num; //

        num = 100;

        getsum.setNum(num);

        num = getsum.sum(); 
        System.out.println(num);

        getsum.setNum(1000);
        num = getsum.sum();
        System.out.println(num);

	}
}
