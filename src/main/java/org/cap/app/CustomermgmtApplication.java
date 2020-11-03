package org.cap.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class CustomerspringDataJPA {

	public static void main(String[] args) {
		SpringApplication.run(CustomerspringDataJPA.class, args);
	}

}
