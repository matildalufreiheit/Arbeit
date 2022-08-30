package governikus.de.garden.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.Data;

//Datenbanktabelle mit 	Name: Plant
//					   	Spalten: id, name, family

@Data
@Entity
@Table(name= "garden")

public class Plant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	//Id - Key, soll automatisch verbegeben werden, deswesen Generated Auto
	private Long id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Familie")
	private String family;
	
	//Datum:
	@Column(name="Aussaat")
	private String plantedAt; //Aussaat
	
	@Column(name="Erntezeit")
	private String picking; //Erntezeit
	
	@Column(name="geerntet am:")
	private String pickedAt; //geerntet
	
	@Column(name="Bluetezeit")
	private String flowering; //Bluetezeit
	
	
	@Column(name="Ertrag")
	private int yield; //Ertrag
	
	@Column(name="Wunchertrag")
	private int goal; //Wunschertrag
	
	//private Date plantedAt;
	
	
	//Constructor richtig?
	
	public Plant() {}

	public Plant(Long id, String name, String family, String seedtime, String picking, String pickedAt, String flowering, int yield,
			int goal) {
		this.id = id;
		this.name = name;
		this.family = family;
		this.plantedAt = seedtime;
		this.picking = picking;
		this.pickedAt = pickedAt;
		this.flowering = flowering;
		this.yield = yield;
		this.goal = goal;
		//this.plantedAt = new date();
	}
	
	
	
	
	
}
