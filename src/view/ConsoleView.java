package view;

import java.util.Scanner;

public class ConsoleView {
    
    private Scanner sc;

    public void displayMenu(){
        boolean bucle = true;
        while (bucle) {
                int op = 0 ;
            System.out.println("Seleccione una Opcion: ");
            System.out.println("1. Agregar Contacto");
            System.out.println("2. Buscar Contacto");
            System.out.println("3. Eliminar Contacto");
            System.out.println("4. Salir");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4 :
                    bucle = false;
                    break;
                
                default:
                    System.out.println("ERROR: valor no valido");
                    break;
        }
        }
        
        

    }

}
