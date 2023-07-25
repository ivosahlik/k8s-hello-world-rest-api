package cz.ivosahlik;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cz.ivosahlik.environment.InstanceInformationService;

@RequiredArgsConstructor
@RestController
public class HelloWorldController {
	
	private final InstanceInformationService service;

	@GetMapping(path = "/")
	public String imUpAndRunning() {
		return "{healthy:true}";
	}

	
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World " + " V3 " + service.retrieveInstanceInfo();
	}

	@GetMapping(path = "/hello-world-bean")
	public HelloWorldDto helloWorldBean() {
		return new HelloWorldDto("Hello World");
	}

	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldDto helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldDto(String.format("Hello World, %s", name));
	}
}
