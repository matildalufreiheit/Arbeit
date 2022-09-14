package governikus.de.garden.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//Datenbanktabelle mit 	Name: Plant
//					   	Spalten: id, name, family

@Data
@Entity
//@Table(name= "garden")
@AllArgsConstructor
@Table
//@Setter
//@Getter
public class Plant {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)	//Id - Key, soll automatisch verbegeben werden, deswesen Generated Auto
	private Long id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Familie")
	private String family;
	
	//Datum:
	@Column(name="Aussaat")
	private LocalDate plantedAt; //Aussaat
	
	@Column(name="Erntezeit")
	private LocalDate picking; //Erntezeit
	
	@Column(name="geerntet")
	private LocalDate pickedAt; //geerntet
	
	@Column(name="Ertrag")
	private int yield; //Ertrag
	
	@Column(name="Wunchertrag")
	private int goal; //Wunschertrag
	 
	
	
}
