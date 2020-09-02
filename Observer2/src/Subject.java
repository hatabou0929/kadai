import java.util.ArrayList;

abstract class Subject {
	public ArrayList<Observer> observers;
	Subject() {
	observers = new ArrayList<Observer>();
	}
	public void attach(Observer o2) {
	observers.add(o2);
	}
	public void detach(Observer o) {
	observers.remove(o);
	}
	public void tsuuchi() {
	for (Observer observer: observers) {
	observer.update(this);
	}
	}
}
