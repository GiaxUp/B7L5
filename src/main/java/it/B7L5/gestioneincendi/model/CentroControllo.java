package it.B7L5.gestioneincendi.model;

public class CentroControllo implements CentroControlloInterface {

	private Comunicazione comunicazione;

	public CentroControllo() {
		this.comunicazione = new Comunicazione();
	}

	@Override
	public void rilevatore(InfoSonda info) {
		comunicazione.sendInfo(info.getIdSonda(), info.getLatitude(), info.getLongitude(), info.getSmokeLevel());

	}

}
