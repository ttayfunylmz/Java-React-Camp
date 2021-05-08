package eTradeDemoHomework.core.concretes;

import eTradeDemoHomework.core.abstracts.ConfirmEmailService;

public class ConfirmEmailManager implements ConfirmEmailService {

	@Override
	public boolean confirmeMail(String email) {
		if(this.confirmeMailCheck()) {
			System.out.println("E-mail has been confirmed successfully.");
			return true;
		}
		System.out.println("E-mail could not be approved.");
		return false;
		
		
	}

	@Override
	public boolean confirmeMailCheck() {
		
		//We simulate that we confirm it successfully.
		return true;
	}
	
	

}
