package com.test.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.mongodb.model.Incoming;
import com.test.mongodb.service.MongodataService;

@RestController
public class ResourceController 
{
	@Autowired
	private MongodataService  service;
    
	@PostMapping("/incoming")
	public Incoming saveincomingjsondata(@RequestBody Incoming data)
	{
		 return service.savejsondata(data);
	}
	
	@GetMapping("/get")
	public List<Incoming> getjsondata()
	{
		return service.getjsondata();
	}
	
}
