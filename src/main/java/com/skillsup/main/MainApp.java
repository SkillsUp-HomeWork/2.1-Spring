package com.skillsup.main;


import com.skillsup.Contact;
import com.skillsup.impl.ContactServiceImpl;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Ivan");
        Contact contact2 = new Contact("Bob");

        ContactServiceImpl contactService = new ContactServiceImpl();
        contactService.addContact(contact1);
        contactService.addContact(contact2);

        printContacts(contactService.getAllContacts());

        contactService.deleteContact(contact1);

        printContacts(contactService.getAllContacts());
    }

    public static void printContacts(List<Contact> contacts){
        for (Contact contact : contacts){
            System.out.println(contact);
        }
    }
}
