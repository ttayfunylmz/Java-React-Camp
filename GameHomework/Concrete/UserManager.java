package Concrete;

import Abstracts.BaseUserManager;
import Abstracts.IUserCheckService;
import Entities.User;

public class UserManager extends BaseUserManager {
	
	IUserCheckService userCheckService;
	
	public UserManager(IUserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}
	
	public void add(User user) {
		if(userCheckService.checkIfRealPerson(user)) {
			System.out.println("Authentication successful ! ");
			System.out.println(user.getFirstName() + " named user is successfully added to database.");
		}
		
		else {
			System.out.println("Authentication failed ! Try again.");
		}
	}

}
