import java.util.Scanner;

public class Practica5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int option;

        do {
            do {
                System.out.println("1) Manejo de Tablas Hash en Java");
                System.out.println("2) Función hash por módulo");
                System.out.println("3) Encadenamiento");
                System.out.println("4) Salir");

                option = scan.nextInt();

            } while (option < 1 || option > 4);

            switch (option) {
                case 1:
                    HashTable stdHash = new HashTable();
                    stdHash.hashMenu();
                    break;
                case 2:
                    HashModulo lstModulo = new HashModulo();
                    lstModulo.moduleMenu();
                    break;
                case 3:
                    Encadenamiento lstEncad = new Encadenamiento();
                    lstEncad.menuEncadenamiento();
                    break;
            }
        } while (option != 4);
    }
}