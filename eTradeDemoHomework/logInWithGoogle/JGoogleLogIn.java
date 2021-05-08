package eTradeDemoHomework.logInWithGoogle;

import eTradeDemoHomework.entities.concretes.User;

public class JGoogleLogIn {
	
	public void logIn(User user) {
		System.out.println("Logged in successfully with Google : " + user.geteMail());
	}
	
	public void register(User user) {
		System.out.println("Registered successfully with Google : " + user.geteMail());
		
	}

}
