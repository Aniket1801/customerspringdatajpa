package org.cap.app..util;

import java.util.*;

import org.springframework.stereotype.Component;

import org.cap.app.dto.CustomerDetails;
import org.cap.app.entities.Customer;

@Component
public class CustomerUtil {

	public List<CustomerDetails> toDetails(Collection<Customer> customers) {
		List<CustomerDetails> desired = new ArrayList<>();
		for (Customer customer : customers) {
			CustomerDetails details = toDetails(customer);
			desired.add(details);
		}
		return desired;
	}

	public CustomerDetails toDetails(Customer customer) {
		return new CustomerDetails(customer.getId(), customer.getFirstName(), customer.getLastName());
	}

}
