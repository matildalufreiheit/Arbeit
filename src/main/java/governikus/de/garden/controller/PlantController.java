package governikus.de.garden.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import governikus.de.garden.model.Plant;
import governikus.de.garden.repository.GardenRepository;


@Controller
public class PlantController {
	
	private final GardenRepository gardenRepository;
	
	public PlantController(GardenRepository gardenRepository) {
		this.gardenRepository = gardenRepository;
	}
	
	
	@GetMapping("/")
	public String home() {
		gardenRepository.saveAll(Arrays.asList(
				new Plant(),
				new Plant(),
				new Plant()
				));
		
		//Plant plant = new Plant();
		//plant.setName("Sonnenblume");
		//model.addAttribute(plant);
		
		return "Plants added";
	}

}
