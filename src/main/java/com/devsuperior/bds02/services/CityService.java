package com.devsuperior.bds02.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.bds02.dto.CityDTO;
import com.devsuperior.bds02.entities.City;
import com.devsuperior.bds02.repositories.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository repository;
	
	@Transactional(readOnly = true)
	public List<CityDTO> findAll() {
		List<City> list =  repository.findAll();
		return list.stream().map(x -> new CityDTO(x)).collect(Collectors.toList());
		
	}

	@Transactional(readOnly = true)
	public CityDTO findById(Long id) {
		Optional<City> obj = repository.findById(id);
		City entity = obj.get();

		return new CityDTO(entity);
	}
}
