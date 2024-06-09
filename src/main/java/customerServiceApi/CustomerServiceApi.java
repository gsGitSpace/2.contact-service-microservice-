package customerServiceApi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerServiceApi {
 
	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApi.class, args);
		
		System.out.println("System configured");
	}
} 
