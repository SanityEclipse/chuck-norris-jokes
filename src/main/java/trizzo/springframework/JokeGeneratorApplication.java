package trizzo.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import trizzo.springframework.services.JokeService;

@SpringBootApplication
public class JokeGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokeGeneratorApplication.class, args);
		
//		System.out.println(JokeService.getJokes());
	}

}
