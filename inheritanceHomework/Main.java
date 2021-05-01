package inheritanceHomework;

public class Main {

	public static void main(String[] args) {
		
		Student user1 = new Student();
		user1.setName("Tayfun");
		user1.setId(1);
		user1.setEmail("tayfun@gmail.com");
		user1.setPassword("123456");
		user1.setAddress("Eskişehir");
		user1.setBillAddress("Akarbaşı Mahallesi");
		
		Instructor user2 = new Instructor();
		user2.setName("Melih");
		user2.setId(2);
		user2.setEmail("melih@gmail.com");
		user2.setPassword("321654");
		user2.setAddress("Atatürk Mahallesi");
		user2.setUserID("M1");
		
		Student user3 = new Student();
		user3.setName("Ebru");
		user3.setId(3);
		user3.setEmail("ebru@gmail.com");
		user3.setPassword("468796");
		user3.setAddress("Atatürk Bulvarı");
		user3.setBillAddress("Kardeşlik Mahallesi");
		
		Instructor user4 = new Instructor();
		user4.setName("Edvin");
		user4.setId(4);
		user4.setEmail("edvin@gmail.com");
		user4.setPassword("87654231");
		user4.setAddress("Edvin Mahallesi");
		user4.setUserID("E1");
		
		Student user5 = new Student();
		user5.setName("Ebrar");
		user5.setId(5);
		user5.setEmail("ebrar@gmail.com");
		user5.setPassword("653216");
		user5.setAddress("Tayfun Mahallesi");
		user5.setBillAddress("Yılmaz Mahallesi");
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(user1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addInstructor(user2);
		
		UserManager  userManager = new UserManager();
		userManager.add(user1);
		userManager.add(user2);
		userManager.add(user3);
		userManager.add(user4);
		userManager.add(user5);
		userManager.update(user1);
		userManager.remove(user4);
		userManager.update(user5);
		

	}

}
