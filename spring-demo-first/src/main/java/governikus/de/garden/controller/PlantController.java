package governikus.de.garden.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import governikus.de.garden.model.Plant;
import governikus.de.garden.repository.GardenRepository;
import governikus.de.garden.service.PlantService;


@Controller //oderRestcontroller?
@RequestMapping("/")
public class PlantController {

	private final GardenRepository gardenRepository;
	
	@Autowired
	public PlantController(GardenRepository gardenRepository) {
		this.gardenRepository = gardenRepository;
		
	}
	
	@GetMapping
	public List<Plant> getPlants(){
		return PlantService.getPlants();
	}

	
}

//private List<Plant> plants = new ArrayList<>();
//public PlantController() {
//	plants.addAll(List.of(
//			new Plant()
//			));
//	}
//
////Want to retrieve all plants:
//@GetMapping("/plants")
//Iterable<Plant> getPlants(){
//	return plants;
//}
//
////Want to retrieve one particular Plant:
//@GetMapping("/plants/{id}")
//Optional<Plant> getPlantById(@PathVariable String id){
//	for(Plant p : plants) {
//		if (p.getId().equals(id)) {
//			return Optional.of(p);
//		}
//	}
//	return Optional.empty();
//}
//