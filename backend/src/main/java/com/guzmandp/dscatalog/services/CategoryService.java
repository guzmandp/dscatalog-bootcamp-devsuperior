package com.guzmandp.dscatalog.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guzmandp.dscatalog.dto.CategoryDTO;
import com.guzmandp.dscatalog.entities.Category;
import com.guzmandp.dscatalog.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private	CategoryRepository repository;
	
	public List<CategoryDTO> findAll(){
		List<Category> list = repository.findAll();
		return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
	}
}
