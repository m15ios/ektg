package e_katalog.com.ru.ektg2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class Ektg2Application {

	public static void main(String[] args) {
		//System.out.println("\n\n\nAPP STARTING\n\n\n");
		log.info("\nAPP STARTING\n");
		SpringApplication.run(Ektg2Application.class, args);
	}

}
