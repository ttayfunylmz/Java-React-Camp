package oopIntroHomework;

public class Motorcycle {

	public Motorcycle() {
		System.out.println("I've worked.");
	}
	
	public Motorcycle(String name, int cc, double price, String detail) {
		this(); //This part is for print the "I've worked." part for every one of our motorcycle example.
		this.name = name;
		this.cc = cc;
		this.price = price;
		this.detail = detail;
		
	}
	
	
	String name;
	int cc;
	double price;
	String detail;
	
}
