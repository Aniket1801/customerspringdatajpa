package org.cap.app.service;

import org.cap.app.entities.*;

public interface ICustomerService {

    Customer register(Customer customer);
	
    Customer findById(Long id);
	
	void deleteById(Long id);

	Customer update(Customer customer);

}
