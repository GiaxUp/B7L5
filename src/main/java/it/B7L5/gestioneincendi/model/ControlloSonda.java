package it.B7L5.gestioneincendi.model;

public class ControlloSonda implements Observer {

	private Long id;

	private CentroControlloInterface centCont;

	public ControlloSonda(Long id, CentroControlloInterface centCont) {
		this.id = id;
		this.centCont = centCont;
	}

	@Override
	public void update(Subject obj) {
		InfoSonda info = creaInfoSonda((Sonda) obj);
		centCont.rilevatore(info);
	}

	private InfoSonda creaInfoSonda(Sonda obj) {
		return new InfoSonda(obj.getId(), obj.getLatitude(), obj.getLongitude(), obj.getSmokeLevel());
	}

	public Long getId() {
		return id;
	}

}
