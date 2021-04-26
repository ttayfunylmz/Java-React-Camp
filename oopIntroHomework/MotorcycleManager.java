package oopIntroHomework;

public class MotorcycleManager {

	public void addToCart(Motorcycle motorcycle) {
		System.out.println("Added to the hamper: " + motorcycle.name);
	}
	
	public void removeFromTheCart(Motorcycle motorcycle) {
		System.out.println("Removed from the hamper: " + motorcycle.name);
	}
}
