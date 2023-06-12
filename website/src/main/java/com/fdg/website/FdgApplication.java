package com.fdg.website;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;




@ComponentScan("com.fdg")
@SpringBootApplication
public class FdgApplication /*implements WebMvcConfigurer */{

	public static void main(String[] args) {
		SpringApplication.run(FdgApplication.class, args);
	}

  /*   @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("accueil");
    }
*/
   
}
