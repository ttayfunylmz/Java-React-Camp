package Abstracts;

import Entities.User;

public abstract class BaseUserManager implements IUserManagerService {
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " named user is added to the database.");
		
	}
	
	public void remove(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " named user is deleted from the database.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " named user is updated.");
	}

}
