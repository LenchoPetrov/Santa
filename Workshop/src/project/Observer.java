package project;


public interface Observer {
	void update();
	void updateSameLine();
	void setTopic(Observable topic);
}
