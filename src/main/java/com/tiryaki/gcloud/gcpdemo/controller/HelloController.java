package com.tiryaki.gcloud.gcpdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
   @Value("${message}")
   String message;
   @GetMapping(value = "demo")
   public ResponseEntity<String> displayHelloMessage() {
      return ResponseEntity.ok(message);
   }
   
   @GetMapping("/hello/{input}")
   public ResponseEntity<String> sayHello(@PathVariable String input) {
		
	   return ResponseEntity.ok("hello " + input );
		
	}
}
