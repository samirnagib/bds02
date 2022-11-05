package com.devsuperior.bds02.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.bds02.entities.City;

@RestController
@RequestMapping(value = "/cities")
public class CityResource {
	
	@GetMapping
	public ResponseEntity<List<City>> findAll() {
		List<City> list = new ArrayList<>();
		list.add(City);
		return ResponseEntity.ok().body(list);
	}

}
