package sampleBoot.Service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import sampleBoot.Model.Task;
import sampleBoot.dao.TaskRepository;

@Service
@Transactional
public class TaskService {

	private TaskRepository taskReposityory;

	public TaskService(TaskRepository taskReposityory) {
		this.taskReposityory = taskReposityory;
	}
	
	public List<Task> getall(){
		List<Task> task=new ArrayList<Task>();
		for(Task tasks:taskReposityory.findAll()) {
			task.add(tasks);
		}
		return task;
	}
	
	public void addtask(Task task) {
		taskReposityory.save(task);
	}
	
	
	
}
