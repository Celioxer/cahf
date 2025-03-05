package cahf.celio;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CahfApplication {

	public static void main(String[] args) {
		SpringApplication.run(CahfApplication.class, args);
			// Mantém o aplicativo rodando
			while (true) {
				try {
					Thread.sleep(1000); // Espera 1 segundo
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

