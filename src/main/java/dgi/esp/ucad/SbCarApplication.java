package dgi.esp.ucad;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@SpringBootApplication
public class SbCarApplication {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(SbCarApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SbCarApplication.class, args);
		logger.info("Car app started! Goto http://localhost:8088/M1GLSI_DEGUENE_FALL");

	}
	@RestController
	@RequestMapping("/M1GLSI_DEGUENE_FALL")
	class CarController {


		@Value("${fullname:Deguene}")
		private String fullname;

		@GetMapping("/fullname")
		String getFullname() {
		return "Work done by Deguene: " + this.fullname + "!";
	}

		
	}
}


