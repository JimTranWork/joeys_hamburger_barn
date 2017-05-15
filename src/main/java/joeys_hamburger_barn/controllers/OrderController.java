package joeys_hamburger_barn.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@RequestMapping("/hello")
	public String test() {
		return "Hello!";
	}
	
}
