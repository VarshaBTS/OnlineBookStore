package com.capgemini.bookstore.entity;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryRepository cr;
	
	@Override
	public Category add(Category c) {
		// TODO Auto-generated method stub
		return cr.save(c);
	}

}
