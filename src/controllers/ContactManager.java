package controllers;



import models.Contact;
import models.LinkedList;

public class ContactManager {
    private LinkedList<Contact> contacts;

    public ContactManager() {
        this.contacts = new LinkedList<>();
    }

    public void addContact(Contact contact) {
        contacts.appendToTail(contact);
    }

    public Contact findContactByName(String name) {
        return contacts.findByValue(new Contact(name));
    }

    public void deleteContactByName(String name) {
        contacts.deleteByValue(new Contact(name));
    }

    public void printList() {
        contacts.print();
    }
}
