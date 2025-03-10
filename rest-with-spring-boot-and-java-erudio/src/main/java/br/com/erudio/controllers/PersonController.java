package br.com.erudio.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.erudio.exceptions.UnsupportedMathOperationException;
import br.com.erudio.model.Person;
import br.com.erudio.services.PersonServices;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonServices service;
	//private PersonService service = new PersonService();
	
	@RequestMapping(value = "/{id}", 
			method=RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public Person findById(@PathVariable(value = "id")String id) throws Exception {
		
		return service.findById(id);
	}
}
