package cahf.celio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "cahf.celio.cahfsite")
@EnableJpaRepositories(basePackages = "cahf.celio.cahfsite.repository")
public class CahfApplication {
	public static void main(String[] args) {
		SpringApplication.run(CahfApplication.class, args);
	}
}