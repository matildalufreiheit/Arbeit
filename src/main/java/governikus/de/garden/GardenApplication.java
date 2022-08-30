package governikus.de.garden;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import governikus.de.garden.model.Plant;
import governikus.de.garden.repository.GardenRepository;



@SpringBootApplication		//Annotation macht deutlich, dass es sich um eine SpringBoot Anwendung handelt

public class GardenApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = 
		SpringApplication.run(GardenApplication.class, args);
		
		Plant Sonnenblume = new Plant();
		Sonnenblume.setName("Sonnenblume");
		Sonnenblume.setFamily("Korbbluetler");
		
		Plant Gaensebluemchen = new Plant();
		Gaensebluemchen.setName("Gaensebluemchen");
		Gaensebluemchen.setFamily("Korbbluetler");
		
		/*GardenRepository gardenRepository = applicationConext.getBean(GardenRepository.class);
		gardenRepository.save(Sonnenblume);
		gardenRepository.save(Gaensebluemchen);*/
	}

}
