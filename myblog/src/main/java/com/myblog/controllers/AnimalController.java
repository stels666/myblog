package com.myblog.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.myblog.models.Animal;
import com.myblog.services.StorageServices;

@Controller
public class AnimalController {
	
	
	@RequestMapping("/animal")
	public ModelAndView getMsg(){
		Animal animal = new Animal();
		animal.setName("dfdfd");
		
		List<Animal> list = StorageServices.getAnimalService().getAll();
		
		return new ModelAndView("animal", "animals", list);
	}

}
