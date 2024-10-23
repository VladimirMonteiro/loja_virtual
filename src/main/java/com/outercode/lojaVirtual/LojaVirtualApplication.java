package com.outercode.lojaVirtual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages = "com.outercode.lojaVirtual.models") //Mapeia onde esta as classes de models
@ComponentScan(basePackages = {"com.outercode.*"}) // mapeia todos components dentro do pacote
@EnableJpaRepositories(basePackages = {"com.outercode.lojaVirtual.repositories"})
@EnableTransactionManagement
public class LojaVirtualApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaVirtualApplication.class, args);
	}

}
