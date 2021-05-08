package eTradeDemoHomework.business.concretes;

import eTradeDemoHomework.business.abstracts.UserService;
import eTradeDemoHomework.core.abstracts.ConfirmEmailService;
import eTradeDemoHomework.core.abstracts.UserValidatorService;
import eTradeDemoHomework.dataAccess.abstracts.UserDao;
import eTradeDemoHomework.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private UserValidatorService userValidatorService;
	private ConfirmEmailService confirmEmailService;
	

	public UserManager(UserDao userDao, UserValidatorService userValidatorService,
			ConfirmEmailService confirmEmailService) {
		super();
		this.userDao = userDao;
		this.userValidatorService = userValidatorService;
		this.confirmEmailService = confirmEmailService;
	}

	@Override
	public void add(User user) {
		if (!user.geteMail().isEmpty() && !user.getPassword().isEmpty()) {
			if (this.userValidatorService.checkeMail(user.geteMail())
					&& this.userValidatorService.checkFirstName(user.getFirstName())
					&& this.userValidatorService.checkLastName(user.getLastName())
					&& this.userValidatorService.checkPassword(user.getPassword())) {
				if (this.userDao.add(user)) {
					confirmEmailService.confirmeMail(user.geteMail());
				}
			} else {
				System.out.println("Incorrect e-mail or password.");
			}
		}
		else {
			System.out.println("You need to enter e-mail and password.");
		}

	}
	

}
