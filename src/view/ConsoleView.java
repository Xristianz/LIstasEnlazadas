package view;

import java.util.Scanner;

public class ConsoleView {
    public void displayMenu() {
        System.out.println("\n--- Menú de Contactos ---");
        System.out.println("1. Añadir contacto");
        System.out.println("2. Buscar contacto");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Mostrar todos los contactos");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public String getInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}