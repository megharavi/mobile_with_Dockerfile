package com.MobileAPI.MobileAPI.mobile;

import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class MobileDAOService {
	private int numberOfContacts = 3;
	private static ArrayList<ContactList> mobileArr = new  ArrayList<ContactList>();
	
	public MobileDAOService() {
		mobileArr.add(new ContactList(1,"megha", 60907232, "Megha-email"));
		mobileArr.add(new ContactList(2,"geetica", 96900907,"geetica-email" ));
		mobileArr.add(new ContactList(3,"pavithra", 969709090,"pavitra-email" ));

	}
	
	public String[] Options() {
		String[] Options = {
				"To view all the contacts : http://localhost:8881/mobile/All_Contacts",

				"To search a contact by serial num : http://localhost:8881/mobile/search_Contact/{serialNum}",
				
				"To add new contact : http://localhost:8881/mobile/add_new_contact",
			
				"To delete a contact by ID : http://localhost:8881//mobile/delete_contact/{serNum} ",
		
//				"To update an existing contact by ID : http://localhost:8888/jpa/adding_new_student"
		};
			
		return Options;
	}
	
	public ArrayList<ContactList>  DisplayAll() {
		return mobileArr;
	}
	
	
	public ContactList addContact(ContactList Contact) {
		if (Contact.getSerNum() == null)
			Contact.setSerNum(++numberOfContacts);
		mobileArr.add(Contact);
		return Contact;
	}
	
	public ContactList RemoveContact(Integer serNum) {
		for(ContactList cont : mobileArr)
		if (cont.getSerNum() == serNum )
			mobileArr.remove(cont);
		return null;
	}
			
	public ContactList searchContact(Integer serNum) {
		for(ContactList cont : mobileArr)
			if (cont.getSerNum() == serNum )
				return cont;
			return null;
	}
		
		
		
	}
	
	
//public Students addStudent(Students student) {
//	studentService.add(student);
//	return student;
