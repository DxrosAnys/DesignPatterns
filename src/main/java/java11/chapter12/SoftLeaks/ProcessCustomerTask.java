package java11.chapter12.SoftLeaks;

import java.util.Optional;

public class ProcessCustomerTask implements Runnable {

	
private CustomerManager cm;
	
	public ProcessCustomerTask(CustomerManager cm) {
		this.cm = cm;
	}
	
	@Override
	public void run() {
		while (true) {		

			Optional<Customer> customer = cm.getNextCustomer();
			if (customer.isEmpty()) {
				//no customers in queue so pause for half a second
				try {
					Thread.sleep((50));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			else {
				//Processing takes place here
			}
		}

	}

}
