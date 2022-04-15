package project;


public class TopicSubscriber implements Observer {

	private String name;
	private Observable topic;

	public TopicSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.topic == null) {
			System.out.println("No topic set");
			return;
		}
		String lastTopic = this.topic.getUpdate();
		System.out.println(this.name + lastTopic);
	}

	@Override
	public void setTopic(Observable topic) {
		this.topic = topic;
	}

	@Override
	public void updateSameLine() {
		if(this.topic == null) {
			System.out.println("No topic set");
			return;
		}
		String lastTopic = this.topic.getUpdate();
		System.out.print(this.name + lastTopic);
		
	}

}
