package project;


public interface Observable {
	void subscribe(Observer observer);
	void unsubscribe(Observer observer);
	
	void notifyObservers();	
	void notifyObserversSameLine();
	String getUpdate();
}
