package it.B7L5.gestioneincendi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.B7L5.gestioneincendi.model.CentroControlloProxy;
import it.B7L5.gestioneincendi.model.ControlloSonda;
import it.B7L5.gestioneincendi.model.Sonda;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class GestioneIncendiApplication {

	private static ControlloSonda controlloSondaTorino;
	private static ControlloSonda controlloSondaVenezia;
	private static ControlloSonda controlloSondaPisa;

	private static CentroControlloProxy controlloTorino;
	private static CentroControlloProxy controlloVenezia;
	private static CentroControlloProxy controlloPisa;

	public static void main(String[] args) {
		SpringApplication.run(GestioneIncendiApplication.class, args);

		Sonda Torino = new Sonda();
		Torino.setId(1l);
		Torino.setLatitude(45.0677551);
		Torino.setLongitude(7.6824892);
		Torino.setSmokeLevel(5);

		Sonda Venezia = new Sonda();
		Venezia.setId(2l);
		Venezia.setLatitude(45.4371908);
		Venezia.setLongitude(12.3345898);
		Venezia.setSmokeLevel(8);

		Sonda Pisa = new Sonda();
		Pisa.setId(3l);
		Pisa.setLatitude(43.7159395);
		Pisa.setLongitude(10.4018624);
		Pisa.setSmokeLevel(2);

		controlloTorino = new CentroControlloProxy();
		controlloVenezia = new CentroControlloProxy();
		controlloPisa = new CentroControlloProxy();

		controlloSondaTorino = new ControlloSonda(1l, controlloTorino);
		controlloSondaVenezia = new ControlloSonda(1l, controlloVenezia);
		controlloSondaPisa = new ControlloSonda(1l, controlloPisa);

		Torino.addObserver(controlloSondaTorino);
		Venezia.addObserver(controlloSondaVenezia);
		Pisa.addObserver(controlloSondaPisa);

		if (Torino.getSmokeLevel() > Torino.SMOKE_LIMIT) {
			log.info("Allarme incendio a Torino!");
			controlloSondaTorino.update(Torino);
		}

		if (Venezia.getSmokeLevel() > Venezia.SMOKE_LIMIT) {
			log.info("Allarme incendio a Venezia!");
			controlloSondaVenezia.update(Venezia);
		}

		if (Pisa.getSmokeLevel() > Pisa.SMOKE_LIMIT) {
			log.info("Allarme incendio a Pisa!");
			controlloSondaPisa.update(Pisa);
		}

	}

}
