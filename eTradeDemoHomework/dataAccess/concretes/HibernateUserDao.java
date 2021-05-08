package eTradeDemoHomework.dataAccess.concretes;



import eTradeDemoHomework.dataAccess.abstracts.UserDao;
import eTradeDemoHomework.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public boolean add(User user) {
		System.out.println("A verification code has been sent to your email address.");
		return true;
	}


	
	}


