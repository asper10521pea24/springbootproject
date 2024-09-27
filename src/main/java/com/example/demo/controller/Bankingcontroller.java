package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bankingentity;
import com.example.demo.repository.Bankingrepository;



@RestController
public class Bankingcontroller {
	
	@Autowired
	public Bankingrepository repo;
	@PostMapping("/added")
	public Bankingentity addstudent(@RequestBody Bankingentity enti) {
		try {
			repo.save(enti);
			return enti;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@PutMapping("/update")
	public Bankingentity updatestudent (@RequestBody Bankingentity enti) {
		try {
			
			repo.save(enti);
			return enti;
		}catch  (Exception e) {
			e.printStackTrace();
		}
	    return null;
	}
	@GetMapping("/get")
	public  List <Bankingentity> getstudent() {
		try {
		
			return repo.findAll() ;
		}catch  (Exception e) {
			e.printStackTrace();
		}
return null;
	}
	
	
	@DeleteMapping ("/delete/{id}")
	public String updatestudent (@PathVariable int id) {
		try {
			Bankingentity enti = repo.getOne(id);
			repo.delete(enti);
			return "user deleted";
			
		}catch  (Exception e) {
			e.printStackTrace();
		}
	    return null;
	}
	

}
