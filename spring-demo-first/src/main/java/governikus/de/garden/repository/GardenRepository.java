package governikus.de.garden.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import governikus.de.garden.model.Plant;

import java.util.List;


@Repository
public interface GardenRepository extends CrudRepository<Plant, Long>
{

	//Save method
//	@Override
//	public void save(Plant plant) {
//		repository.put(plant.getId(), plant);
//	}
	
	//Find a student by its id
	public Plant findPlantById(int id) {
		return Repository.get(id);
		
	}
	
}
