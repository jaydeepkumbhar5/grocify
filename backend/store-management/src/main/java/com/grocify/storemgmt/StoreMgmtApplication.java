package com.grocify.storemgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.grocify.commonlibs.*") /* It activates Spring Data JPA's repository support. */

@EnableJpaAuditing  /* automatic tracking of entity changes such as 
// creation date, last modified date, created by, and last modified by */

@EntityScan("com.grocify.commonlibs.*")  /* By default, Spring Boot only 
scans for entity classes in the same package as the 
@SpringBootApplication annotated class. If your entities are located 
in a different package, you need @EntityScan to explicitly tell Spring 
Boot where to find them. */

@ComponentScan(basePackages = "com.grocify.*")  /* The @ComponentScan 
annotation in Spring Boot is used to specify the base packages where 
Spring should scan for Spring-managed components, such as:
 @Component , @Service , @Repository ,@Controller / @RestController */

public class StoreMgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreMgmtApplication.class, args);
	}

}
