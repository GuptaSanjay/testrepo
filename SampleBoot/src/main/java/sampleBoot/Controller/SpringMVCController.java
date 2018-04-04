package sampleBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import sampleBoot.Service.TaskService;

@Controller
public class SpringMVCController {
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/")
	public String welcomeagain() {
		return "index";
	}
	
	@GetMapping("/getall")
	public String getall()
	{
		return taskService.getall().toString();
	}
}
