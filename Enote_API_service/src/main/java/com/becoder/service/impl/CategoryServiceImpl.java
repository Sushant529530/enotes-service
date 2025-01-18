package com.becoder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
 
import com.becoder.entity.Category;
import com.becoder.repository.CategoryRepository;
import com.becoder.service.CategoryService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepo;
	
	@Override
	public Boolean saveCategory(Category category) {
		
		category.setIsDeleted(false);
		System.out.println(category.getIsActive());
		Category savedcategory=categoryRepo.save(category);
		
		if(ObjectUtils.isEmpty(savedcategory)) {
			return false;
		}
		
		return true;
	}

	@Override
	public List<Category> getAllCategory() {
		 
		List<Category> categories =  categoryRepo.findAll();
		return categories;
	}

}
