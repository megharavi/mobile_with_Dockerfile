package com.MobileAPI.MobileAPI.mobile;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MobileResourceJPA {
	
@Autowired
	private JpaRepository reposervice;	

//@GetMapping(path ="/jpa/mobile/Options")
//	public String[] Options(){
//	return reposervice.Options();
//}

@GetMapping(path ="/jpa/mobile/All_Contacts")
	public List Display(){
	return reposervice.findAll();
	}

@GetMapping(path = "/jpa/mobile/search_Contact/{phNum}")
	public Optional searchContact(@PathVariable Integer phNum) {
		return reposervice.findById(phNum);
}

@PostMapping(path="/jpa/mobile/add_new_contact")
	public void addContact(@RequestBody ContactListJPA contact) {
	Object newcontact = reposervice.save(contact);
}

@DeleteMapping(path="/jpa/mobile/delete_contact/{serNum}")
	public void deleteContact(@PathVariable int serNum) {
	 reposervice.deleteById(serNum);	
}

//public Object () {
//
//	Optional<>  = 
//
//	if (!cont.isPresent())
//		return null;
//
//	cont.setId(serNum);
//	
//	.save(cont);
//
//	return cont;
//}
//	
	
@PutMapping("/jpa/mobile/update_contact/{name}")
public ResponseEntity<Object> updateContact(@RequestBody ContactListJPA contact, @PathVariable String name) {
	
	Optional<ContactListJPA> cont = reposervice.findById (name);

	if (!cont.isPresent())
		return ResponseEntity.notFound().build();

	((ContactListJPA) reposervice).setName(name);
	
	reposervice.save(cont);
	return ResponseEntity.noContent().build();
}	
}	