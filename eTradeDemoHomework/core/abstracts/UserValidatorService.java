package eTradeDemoHomework.core.abstracts;

public interface UserValidatorService {
	
	boolean checkFirstName(String firstName);
	boolean checkLastName(String lastName);
	boolean checkeMail(String email);
	boolean checkPassword(String password);
	

}
