package Adapters;

import Abstracts.IUserCheckService;
import Entities.User;

public class MernisCheckService implements IUserCheckService{

	@Override
	public boolean checkIfRealPerson(User user) {
		
		return true;
	}

}
