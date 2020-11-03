package org.cap.app.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.cap.app.dao.ICustomerDao;
import org.cap.app.entities.Customer;
import org.cap.app.exceptions.*;



@Transactional
@Service
public class CustomerServiceImpl implements ICustomerService{
	
	@Autowired
	private ICustomerDao customerDao;

	@Override
	public Customer register(Customer customer) {
        boolean exists=customer.getId()!=null && customerDao.existsById(customer.getId());
        if(exists){
            throw new CustomerAlreadyExistsException("customer already exists for id="+customer.getId());
        }
        customer = customerDao.save(customer);
		return customer;
	}

	@Override
	public Customer findById(Long id) {
		Optional<Customer> optional = customerDao.findById(id);
		if(!optional.isPresent())
			throw new CustomerNotFoundException("customer not found for id="+id);
		return optional.get();
	}

	@Override
	public void deleteById(Long id) {
		Customer customer = findById(id);
		customerDao.delete(customer);
		
	}

	@Override
	public Customer update(Customer customer) {
		Customer customer1 = customerDao.save(customer);
		return customer1;
	}

}
