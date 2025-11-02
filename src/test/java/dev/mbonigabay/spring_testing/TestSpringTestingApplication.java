package dev.mbonigabay.spring_testing;

import org.springframework.boot.SpringApplication;

public class TestSpringTestingApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringTestingApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
