package sampleBoot.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

 @Entity
 @Table(name="TaskManager")
public class Task {
	 @Id
	private int id;
	private String name;
	private String description;
	private Date dateCreated;
	private boolean finished;
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task(int id, String name, String description, Date dateCreated, boolean finished) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.dateCreated = dateCreated;
		this.finished = finished;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	
	

}
