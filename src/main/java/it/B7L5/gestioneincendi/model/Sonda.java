package it.B7L5.gestioneincendi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sonda extends Subject {

	public final int SMOKE_LIMIT = 5;

	private Long id;
	private double latitude;
	private double longitude;
	private int smokeLevel = 0;

	public Sonda(Long id, double latitude, double longitude) {
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public void setSmokeLevel(int smoke) {
		this.smokeLevel = smoke;

		if (smokeLevel > SMOKE_LIMIT) {
			super.notifyObservers();
		}
	}

}
