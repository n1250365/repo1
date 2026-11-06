package com.example.demo.config;

import org.springframework.context.annotation.*;

import com.example.demo.service.*;
import com.example.demo.service.impl.*;

@Configuration
public class AppConfig {
	@Bean(name = "test")
	public BusinessLogic dataLogic() {
		return new TestLogicImpl();
	}
	
	@Bean(name = "sample")
	public BusinessLogic viewLogic() {
		return new SampleLogicImpl();
	}
}
