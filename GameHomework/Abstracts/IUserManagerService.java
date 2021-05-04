package Abstracts;

import Entities.User;

public interface IUserManagerService {
	
	void add(User user);
	
	void remove(User user);
	
	void update(User user);

}
