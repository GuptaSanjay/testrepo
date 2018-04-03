package sampleBoot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringMVCController {
	
	@GetMapping("/")
	public String welcomeagain() {
		return "index";
	}
}
