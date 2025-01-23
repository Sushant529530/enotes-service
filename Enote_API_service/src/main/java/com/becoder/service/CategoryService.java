package com.becoder.service;

import java.util.List;

import com.becoder.dto.CategoryDto;
import com.becoder.dto.CategoryResponseDto;
import com.becoder.entity.Category;
 

public interface CategoryService {
	
	public Boolean saveCategory(CategoryDto categorydto);
	
	public List<CategoryResponseDto> getAllCategory();
	
	public List<CategoryResponseDto> getActiveCategory();

}
