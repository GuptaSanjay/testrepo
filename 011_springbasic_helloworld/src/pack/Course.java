package pack;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Course {
	private String topicTraining;
	private int duration;
	public Course() {
		super();
		System.out.println("super() is called");
		// TODO Auto-generated constructor stub
	}
	public Course(String topicTraining, int duration) {
		super();
		this.topicTraining = topicTraining;
		this.duration = duration;
	}
	public String getTopicTraining() {
		return topicTraining;
	}
	public void setTopicTraining(String topicTraining) {
		this.topicTraining = topicTraining;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init() is called");
	}
	public void getInformation() {
		System.out.println("bean is called");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy() is called");
	}
	
	

}
