package sampleBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sampleBoot.Service.TaskService;

@RestController
public class SampleRestController {
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/hello")
	public String welcome() {
		return "Hello SpringBoot";
	}
	
	@GetMapping("/alltask")
	public String allTask() {
		return taskService.getall().toString();
	}
	
	public String saveTask(@RequestParam String name,@RequestParam String description) {
		return "task saved";
	}

}
