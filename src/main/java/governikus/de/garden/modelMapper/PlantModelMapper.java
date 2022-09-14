package governikus.de.garden.modelMapper;

import governikus.de.garden.dto.PlantDTO;

public class PlantModelMapper {
	
	PlantModelMapper modelMapper = new PlantModelMapper();
	PlantDTO plantDTO = modelMapper.map(plantDTO, PlantDTO.class);

}
