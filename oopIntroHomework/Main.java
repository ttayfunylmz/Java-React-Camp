package oopIntroHomework;

public class Main {

	public static void main(String[] args) {
		//main
		Motorcycle motor1 = new Motorcycle("Bajaj Pulsar NS-200", 200, 15000, "Best 200cc motorcycle ever!");

		Motorcycle motor2 = new Motorcycle();
		motor2.name = "Yamaha R-25";
		motor2.cc = 250;
		motor2.price = 40000;
		motor2.detail = "My dream motorcycle :(";
		
		Motorcycle motor3 = new Motorcycle();
		motor3.name = "Cbr 1000-RR";
		motor3.cc = 1000;
		motor3.price = 95000;
		motor3.detail = "Maybe the most powerful bike.";
				
		
	   Motorcycle[] motorcycles = {motor1,motor2,motor3};
	   
	   System.out.println("-----------------------");
	   
	   for(Motorcycle motorcycle : motorcycles) {
		   System.out.println(motorcycle.name);
		   System.out.println(motorcycle.cc);
		   System.out.println(motorcycle.price);
		   System.out.println(motorcycle.detail);
		   System.out.println("-----------------------");
	   }
		
	   System.out.println("The number of laps I've worked on: " + motorcycles.length);
		
	   System.out.println("-----------------------");
	   
	   Category category1 = new Category();
	   category1.id = 1;
	   category1.name = "Motorcycles";
	   
	   Category category2 = new Category();
	   category2.id = 2;
	   category2.name = "Cars";
	   
	   Category category3 = new Category();
	   category3.id = 3;
	   category3.name = "Bikes";
	   
	   MotorcycleManager motorcycleManager = new MotorcycleManager();
	   
	   motorcycleManager.addToCart(motor1);
	   motorcycleManager.addToCart(motor2);
	   motorcycleManager.addToCart(motor3);
	   motorcycleManager.removeFromTheCart(motor3);
	   motorcycleManager.removeFromTheCart(motor2);
		
		
	}

}
