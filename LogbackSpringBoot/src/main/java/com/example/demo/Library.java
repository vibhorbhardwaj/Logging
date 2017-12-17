package com.example.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
public class Library implements CommandLineRunner {

	public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Library.class);
        app.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		 ExecutorService executor = Executors.newFixedThreadPool(3);
	        for (int i = 0; i < 10; i++) {
	        	Runnable triggerConsumer = new TriggerConsumer(new Trigger(i,i,"sourcename-"+i));
	            executor.submit(triggerConsumer);
	        }
	        executor.shutdown();
		
	}
	
}
