package governikus.de.garden.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import governikus.de.garden.model.Plant;

//import java.util.List


@Repository
public interface GardenRepository extends CrudRepository<Plant, Long>
{

	//List<Plant> findByFamily(String family);
	//Plant findById(long id);
}
