package governikus.de.garden.service;

import java.util.List;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import governikus.de.garden.model.Plant;
import governikus.de.garden.repository.GardenRepository;

@Service
public class PlantService {
	
	private final GardenRepository gardenRepository;
	
	@Autowired
	public PlantService(GardenRepository gardenRepository) {
		this.gardenRepository = gardenRepository;
	}
	
public List<Plant> getPlants(){
	return gardenRepository.findAll();
				
}

}
