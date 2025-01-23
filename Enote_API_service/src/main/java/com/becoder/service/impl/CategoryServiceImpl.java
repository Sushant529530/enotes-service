package com.becoder.service.impl;

import java.lang.System.Logger;
import java.util.Date;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.becoder.dto.CategoryDto;
import com.becoder.dto.CategoryResponseDto;
import com.becoder.entity.Category;
import com.becoder.repository.CategoryRepository;
import com.becoder.service.CategoryService;

import lombok.extern.slf4j.Slf4j;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public Boolean saveCategory(CategoryDto categorydto) {
 		
//		category.setIsDeleted(false);
//		System.out.println(category.getIsActive());
//		Category savedcategory=categoryRepo.save(category);
		
		Category category=mapper.map(categorydto, Category.class);
		category.setIsDeleted(false);
		category.setCreatedBy(1);
		 
		Category savedcategory=categoryRepo.save(category);
		System.out.println(savedcategory);
		if(ObjectUtils.isEmpty(savedcategory)) {
			return false;
		}
		
		return true;
	}

	@Override
	public List<CategoryResponseDto> getAllCategory() {
		 
		List<Category> categories =  categoryRepo.findAll();
		
		List<CategoryResponseDto> categoriesdto=categories.stream()
				.map(category -> mapper.map(category, CategoryResponseDto.class))
				.collect(Collectors.toList());
		
//		 categories.stream().forEach(System.out::println);
//		 categoriesdto.stream().forEach(System.out::println);
		
		return categoriesdto;
	}

	@Override
	public List<CategoryResponseDto> getActiveCategory() {
		 
	List<Category> categories =  categoryRepo.findAll().stream().filter(category -> category.getIsActive() == true).toList();
		
	categories.add(new Category(1,"java","jAva"));
		List<CategoryResponseDto> categoriesdto=categories.stream()
				.map(category -> mapper.map(category, CategoryResponseDto.class))
				.collect(Collectors.toList());
		
		return categoriesdto;
		
		
	}

}
