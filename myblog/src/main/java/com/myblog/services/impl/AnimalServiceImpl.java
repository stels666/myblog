package com.myblog.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myblog.dao.AbstractDAO;
import com.myblog.dao.AnimalDao;
import com.myblog.models.Animal;
import com.myblog.services.AnimalService;

@Service
@Transactional(readOnly = true)
public class AnimalServiceImpl extends AbstractServiceImpl<Animal> implements AnimalService {

	@Autowired
	private AnimalDao animalDao;

	@Override
	public AbstractDAO<Animal> getDAO() {
		return animalDao;
	}

}
