package controllers;

import models.Contact;
import view.ConsoleView;

public class MenuController {
    private ContactManager contactManager;
    private ConsoleView consoleView;

    public MenuController() {
        this.contactManager = new ContactManager();
        this.consoleView = new ConsoleView();
    }

    public void showMenu() {
        int option;
        do {
            consoleView.displayMenu();
            String input = consoleView.getInput("");
           
            option = Integer.parseInt(input);
            switch (option) {
                case 1:
                    addContact();
                    break;
                case 2:
                    findContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    printList();
                    break;
                case 5:
                    consoleView.showMessage("Saliendo del programa...");
                    break;
                default:
                    consoleView.showMessage("Opción no válida. Intente de nuevo.");
                }
            
        } while (option != 5);
    }

    private void addContact() {
        String name = consoleView.getInput("Ingrese el nombre del contacto: ");
        String phone = consoleView.getInput("Ingrese el teléfono del contacto: ");
        Contact contact = new Contact(name, phone);
        contactManager.addContact(contact);
        consoleView.showMessage("Contacto añadido exitosamente.");
    }

    private void findContact() {
        String name = consoleView.getInput("Ingrese el nombre a buscar: ");
        Contact contact = contactManager.findContactByName(name);
        if (contact != null) {
            consoleView.showMessage("Contacto encontrado: " + contact.toString());
        } else {
            consoleView.showMessage("Contacto no encontrado.");
        }
    }

    private void deleteContact() {
        String name = consoleView.getInput("Ingrese el nombre del contacto a eliminar: ");
        contactManager.deleteContactByName(name);
        consoleView.showMessage("Contacto eliminado exitosamente.");
    }

    private void printList() {
        consoleView.showMessage("--- Lista de Contactos ---");
        contactManager.printList();
    }
}