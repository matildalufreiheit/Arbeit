package governikus.de.garden.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class PlantDTO {
	
	private String name;
	private String family;
	private String plantedAt;
	private String picking; //Erntezeit
	private String pickedAt; //geerntet
	private String flowering; //Bluetezeit
	private int yield; //Ertrag
	private int goal; //Wunschertrag
}
