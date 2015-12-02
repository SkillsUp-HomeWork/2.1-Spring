package com.skillsup.impl;

import com.skillsup.Contact;
import com.skillsup.ContactService;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ContactServiceImpl implements ContactService {

    private List<Contact> contacts = new ArrayList<Contact>();

    @Override
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public void deleteContact(Contact contact) {
        for (ListIterator<Contact> i = contacts.listIterator(); i.hasNext();) {
            Contact selectContact = i.next();
            if (selectContact.equals(contact)) {
                i.remove();
                break;
            }
        }
    }

    @Override
    public void clearAll() {
        contacts.clear();
    }

    @Override
    public List<Contact> getAllContacts() {
        return contacts;
    }
}
