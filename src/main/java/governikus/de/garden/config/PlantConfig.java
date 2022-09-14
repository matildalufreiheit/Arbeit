package governikus.de.garden.config;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import governikus.de.garden.model.Plant;
import governikus.de.garden.repository.GardenRepository;

@Configuration
public class PlantConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(GardenRepository repository) {
		return args -> {
			Plant Sonnenblume = new Plant(
					1L,
					"Sonnenblume",
					"Körbblüter",
					LocalDate.of(2022, Month.MARCH, 5),
					LocalDate.of(2022, Month.JUNE, 6),
					LocalDate.of(2022, Month.JUNE, 30),
					50,
					60
					);
			Plant Potatoes = new Plant(
					2L,
					"Kartoffel",
					"DontKnow",
					LocalDate.of(2022, Month.MARCH, 5),
					LocalDate.of(2022, Month.SEPTEMBER, 6),
					LocalDate.of(2022, Month.AUGUST, 30),
					50,
					30
					);
			
			repository.saveAll(List.of(Sonnenblume, Potatoes)
					);
		};
	}

}
