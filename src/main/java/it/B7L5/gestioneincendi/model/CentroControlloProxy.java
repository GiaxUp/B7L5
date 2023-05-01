package it.B7L5.gestioneincendi.model;

public class CentroControlloProxy implements CentroControlloInterface {

	private CentroControlloInterface cenConInt;

	public CentroControlloProxy() {
		cenConInt = CentroControlloFactory.creaCentroControllo();
	}

	@Override
	public void rilevatore(InfoSonda info) {
		cenConInt.rilevatore(info);

	}

}
