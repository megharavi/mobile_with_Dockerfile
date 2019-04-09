package com.MobileAPI.MobileAPI.mobile;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MobileResources {
	
@Autowired
	private MobileDAOService service;	

@GetMapping(path ="/mobile/Options")
	public String[] Options(){
	return service.Options();
}

@GetMapping(path ="/mobile/All_Contacts")
	public ArrayList<ContactList> Display(){
	return service.DisplayAll();
	}

@GetMapping(path = "/mobile/search_Contact/{serialNum}")
	public ContactList searchContact(Integer serialNum) {
		return searchContact(serialNum);
}

@PostMapping(path="/mobile/add_new_contact")
	public void addContact(@RequestBody ContactList contact) {
	ContactList newcontsct = service.addContact(contact);
}

@DeleteMapping(path="/mobile/delete_contact/{serNum}")
	public ContactList deleteContact(@PathVariable int serNum) {
	return service.RemoveContact(serNum);	
}
	
	
	
}


//@PostMapping("/addStudent")
//public void addStudent(@RequestBody DevOpsStudent Student) {
//	DevOpsStudent newStudent = service.addStudent(Student);
//		