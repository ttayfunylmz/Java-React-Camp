package inheritanceHomework;

public class UserManager {
	
	public void add(User user) {
		System.out.println("User is added : " + user.getName());
	}
	
	public void remove(User user) {
		System.out.println("User is removed : " + user.getName());
	}
	
	public void update(User user) {
		System.out.println("User is updated : " + user.getName());
	}
	
	public void addMultiple(User[] users) {
		for(User user: users) {
			add(user);
		}
	}


}
