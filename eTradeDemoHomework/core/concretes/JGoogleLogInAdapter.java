package eTradeDemoHomework.core.concretes;

import eTradeDemoHomework.core.abstracts.GoogleLogInService;
import eTradeDemoHomework.entities.concretes.User;
import eTradeDemoHomework.logInWithGoogle.JGoogleLogIn;

public class JGoogleLogInAdapter implements GoogleLogInService{

	@Override
	public void logIn(User user) {
		JGoogleLogIn jGoogleLogIn = new JGoogleLogIn();
		jGoogleLogIn.logIn(user);
		
	}

	@Override
	public void register(User user) {
		JGoogleLogIn jGoogleLogIn = new JGoogleLogIn();
		jGoogleLogIn.register(user);
		
		
	}

}
