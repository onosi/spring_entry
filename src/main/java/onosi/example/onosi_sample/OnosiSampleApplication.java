package onosi.example.onosi_sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OnosiSampleApplication {

	@GetMapping("/")
	String hello() {
		return "Hello world!";
	}

	public static void main(String[] args) {
		SpringApplication.run(OnosiSampleApplication.class, args);
	}

}
