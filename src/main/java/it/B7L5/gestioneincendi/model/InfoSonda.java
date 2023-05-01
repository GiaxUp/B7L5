package it.B7L5.gestioneincendi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
public class InfoSonda {

	private final Long idSonda;
	private final double latitude;
	private final double longitude;
	private final int smokeLevel;

}
