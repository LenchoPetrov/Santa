package project;


import java.util.ArrayList;
import java.util.List;

public class Topic implements Observable {

	private List<Observer> observers;
	private String topic;
	
	public Topic() {
		this.observers = new ArrayList<>();
	}
	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setTopic(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
		observer.setTopic(null);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}
	
	@Override
	public void notifyObserversSameLine() {
		for(Observer observer: this.observers) {
			observer.updateSameLine();
		}		
	}

	@Override
	public String getUpdate() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
		this.notifyObservers();
	}
	
	public void setTopicSameLine(String topic) {
		this.topic = topic;
		this.notifyObserversSameLine();
	}
}