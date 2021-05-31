package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.example.controllers"})
@EntityScan(basePackages = {"com.example.models"})
@EnableJpaRepositories("com.example.repository")
public class SpringWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebAppApplication.class, args);
	}

}

/**Link da vídeo aula
 * https://www.youtube.com/watch?v=8nw7qeCr1MM
 * https://www.youtube.com/watch?v=uXnde3lNPV8&list=PL8iIphQOyG-DHLpEx1TPItqJamy08fs1D&index=15
 * Última aula 16
 */

