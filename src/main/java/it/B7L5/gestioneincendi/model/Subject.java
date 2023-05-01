package it.B7L5.gestioneincendi.model;

import java.util.List;
import java.util.ArrayList;

public abstract class Subject {

	private final List<Observer> observers = new ArrayList<Observer>();

	public void notifyObservers() {
		this.getObservers().forEach(e -> e.update(this));
	}

	public void addObserver(Observer obs) {
		this.getObservers().add(obs);
	}

	public boolean removeObserver(Observer obs) {
		return this.getObservers().remove(obs);
	}

	public List<Observer> getObservers() {
		return observers;
	}

}
