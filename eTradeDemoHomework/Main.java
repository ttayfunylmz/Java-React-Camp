package eTradeDemoHomework;

import eTradeDemoHomework.business.abstracts.UserService;
import eTradeDemoHomework.business.concretes.UserManager;
import eTradeDemoHomework.core.abstracts.GoogleLogInService;
import eTradeDemoHomework.core.concretes.ConfirmEmailManager;
import eTradeDemoHomework.core.concretes.JGoogleLogInAdapter;
import eTradeDemoHomework.core.concretes.UserValidatorManager;
import eTradeDemoHomework.dataAccess.concretes.HibernateUserDao;
import eTradeDemoHomework.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1, "Tayfun", "Yýlmaz", "tayfun@gmail.com", "123456");
		User user2 = new User(2, "Edvin", "Davulcu", "edvin@gmail.com", "123456");
		User user3 = new User(3, "Melih", "Sahtiyan", "melih@gmail.com", "123456");
		User user4 = new User(4, "Ebru", "Sayil", "ebru@gmail.com", "123456");
		User user5 = new User(5, "Ebrar", "Ýmancý", "ebrar@gmail.com", "123456");
		
		
		UserService userService = new UserManager(new HibernateUserDao(), new UserValidatorManager(), new ConfirmEmailManager());
		
		GoogleLogInService googleLogInService = new JGoogleLogInAdapter();
		
		System.out.println("---------------------------------------");
		
		userService.add(user1);
		userService.add(user2);
		
		System.out.println("---------------------------------------");
		
		googleLogInService.logIn(user3);
		
		System.out.println("---------------------------------------");
		
		googleLogInService.register(user4);
		
		System.out.println("---------------------------------------");
		
		googleLogInService.logIn(user5);

	}

}
