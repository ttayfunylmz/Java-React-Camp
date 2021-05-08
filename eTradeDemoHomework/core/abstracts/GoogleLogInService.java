package eTradeDemoHomework.core.abstracts;

import eTradeDemoHomework.entities.concretes.User;

public interface GoogleLogInService {
	
	public void logIn(User user);
	public void register(User user);

}
