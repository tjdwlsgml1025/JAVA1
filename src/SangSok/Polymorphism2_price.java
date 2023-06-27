package SangSok;

class Price{
	private double price = 0;
	
	Price (double price){
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
}

class Computer extends Price{
	public Computer(double price) {
		super(price);
	}
}

class Speaker extends Price{
	public Speaker (double price) {
		super(price);
	}
}


public class Polymorphism2_price {
	
	public static void checkPrice(Price price) {
		System.out.println(price.getPrice());
	}

	public static void main(String[] args) {
		Computer computer = new Computer(100);
		Speaker speaker = new Speaker(50);
		
		checkPrice(computer);
		checkPrice(speaker);
		
	}

}
