package controllers;



import models.Contact;
import models.LinkedList;

public class ContactManager {
    private LinkedList<Contact<String, String>> contacts;

    public ContactManager() {
        this.contacts = new LinkedList<>();
    }

    public void addContact(Contact<String, String> contact) {
        contacts.appendToTail(contact);
    }

    public Contact<String, String> findContactByName(String name) {
        return contacts.findByValue(new Contact<>(name, null));
    }

    public void deleteContactByName(String name) {
        contacts.deleteByValue(new Contact<>(name, null));
    }

    public void printList() {
        contacts.print();
    }
}
