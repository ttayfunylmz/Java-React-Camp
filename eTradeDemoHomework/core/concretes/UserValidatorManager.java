package eTradeDemoHomework.core.concretes;

import java.util.regex.Pattern;

import eTradeDemoHomework.core.abstracts.UserValidatorService;

public class UserValidatorManager implements UserValidatorService {

	@Override
	public boolean checkFirstName(String firstName) {
		if(firstName.length() < 2 ) {
			System.out.println("Your first name must include at least 2 characters");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkLastName(String lastName) {
		if(lastName.length() < 2 ) {
			System.out.println("Your last name must include at least 2 characters");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkeMail(String email) {
		Pattern mailRegex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		if(mailRegex.matcher(email).find()) {
			System.out.println("Signing in to your e-mail successfully.");
			return true;
		}
		System.out.println("Your e-mail is incorrect.");
		return false;
	}

	@Override
	public boolean checkPassword(String password) {
		if(password.length() < 6 ) {
			System.out.println("The password must include at least 6 characters");
			return false;
		}
		return true;
	}

	
	
	
	

}
