package Main;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		ICustomerCheckService customerCheckService = new ICustomerCheckService() {
			
			@Override
			public boolean checkIfRealPerson(Customer customer) {
			
				return true;
			}
		};
		
		
		BaseCustomerManager customerManager1 = new NeroCustomerManager();
		customerManager1.Save(new Customer(1, "Tayfun", "Yýlmaz", 2000, "00000000000"));
		
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(customerCheckService);
		customerManager2.Save(new Customer(2, "Edvin", "Davulcu", 2001, "00000000000"));
		
		BaseCustomerManager customerManager3 = new NeroCustomerManager();
		customerManager3.Save(new Customer(3, "Melih", "Sahtiyan", 2000, "00000000000"));
		
		BaseCustomerManager customerManager4 = new StarbucksCustomerManager(customerCheckService);
		customerManager4.Save(new Customer(4, "Ebru", "Sayil", 2001, "00000000000"));

	}

}
