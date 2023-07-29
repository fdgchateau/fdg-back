package com.fdg.website;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableAsync
public class FdgApplication{

	public static void main(String[] args) {
		SpringApplication.run(FdgApplication.class, args);
	} 
   
}
