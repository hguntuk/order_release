package harish.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDiscoveryClient
public class OrderApplication {

	public static void main(String[] args) {

		SpringApplication.run(OrderApplication.class, args);
		System.out.println("Control come here");
	}

}
