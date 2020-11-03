package org.cap.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.cap.app.entities.Customer;

public interface ICustomerDao extends JpaRepository<Customer, Long>{
	
	List<Customer> findByFirstName(String firstName);
	List<Customer> findByLastName(String lastName);
	
	List<Customer> findByFirstNameAndLastName(String firstName, String lastName);

}
