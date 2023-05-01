package it.B7L5.gestioneincendi.model;

import lombok.Data;

@Data

public class CentroControlloFactory {

	public static CentroControlloInterface creaCentroControllo() {
		return new CentroControllo();
	}

}
