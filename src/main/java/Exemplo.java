import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Exemplo {
	
	
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/teste")
	String teste() {
		return "teste!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Exemplo.class, args);
	}
}
