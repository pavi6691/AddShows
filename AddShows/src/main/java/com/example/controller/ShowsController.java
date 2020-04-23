package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Show;
import com.example.services.DatabaseException;
import com.example.services.ShowServices;

@RestController
@RequestMapping(value = "/admin")
public class ShowsController {
	
	@Autowired
	ShowServices services;
	
	@RequestMapping(value = "/addShow")
	public String addShows(@RequestBody Show show) throws DatabaseException {
		return services.addShow(show);
	}

}
