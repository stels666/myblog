package com.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;

public class StorageServices {
	
	private static final StorageServices singleton = new StorageServices();
	
	@Autowired
	private AnimalService animalService;
	
	
	public static AnimalService getAnimalService(){
		return getSingleton().animalService;
	}

	public static StorageServices getSingleton() {
		return singleton;
	} 

}
