import java.util.Scanner;
import java.util.HashMap;

public class HashTable {

    HashMap < Integer, String > stdlist = new HashMap < > ();
    Scanner scan = new Scanner(System.in);

    int key;
    String name;

    public void hashMenu() {

        int option;

        do {
            do {
                System.out.println("1) Ingresar estudiantes");
                System.out.println("2) Contains");
                System.out.println("3) containsKey");
                System.out.println("4) containsValue");
                System.out.println("5) equals");
                System.out.println("6) get");
                System.out.println("7) put");
                System.out.println("8) remove");
                System.out.println("9) size");
                System.out.println("10) Salir");

                option = scan.nextInt();
            }
            while (option < 1 || option > 10);

            swMenu(option);

        }
        while (option != 10);
    }

    private void swMenu(Integer option) {
        switch (option) {
            case 1:
                insertStudents();
                break;
            case 2:
                containing();
                break;
            case 3:
                contKey();
                break;
            case 4:
                containsVal();
                break;
            case 5:
                break;
            case 6:
                showName();
                break;
            case 7:
                insertNew();
                break;
            case 8:
                removeStd();
                break;
            case 9:
                mapSize();
                break;
        }
    }

    private void insertStudents() {
        System.out.println("No. de estudiantes a ingresar: ");

        int number = scan.nextInt();

        for (int i = 0; i < number; i++) {
            insertStd();
        }
    }

    private boolean ifEmpty() {
        return stdlist.isEmpty();
    }

    private void contKey() {
        if (ifEmpty()) {
            System.out.println("No existen elementos en la tabla");
        } else {
            System.out.println("Ingrese llave a buscar: ");
            key = scan.nextInt();

            if (stdlist.containsKey(key)) {
                System.out.println("La llave " + key + "se encuentra en la lista");
            } else {
                System.out.println("La llave " + key + " NO se encuentra en la lista");
            }
        }
    }

    private void containsVal() {
        if (ifEmpty()) {
            System.out.println("No existen elementos en la tabla");
        } else {
            System.out.println("Ingrese valor a buscar: ");
            name = scan.next();

            if (stdlist.containsValue(name)) {
                System.out.println("El nombre " + name + "se encuentra en la lista");
            } else {
                System.out.println("El nombre " + name + " NO se encuentra en la lista");
            }
        }
    }

    private void insertNew() {
        if (ifEmpty()) {
            System.out.println("No existen elementos en la tabla");
        } else {
            System.out.println("Ingrese nuevo elemento a tabla Hash: ");

            insertStd();

            System.out.println("Estudiante ingresado: ");

        }
    }

    private void insertStd() {
        System.out.println("Inserte nombre: ");
        name = scan.useDelimiter("\n").next();
        
        System.out.println("Inserte cuenta: ");
        key = scan.nextInt();

        stdlist.put(key, name);
    }

    private void removeStd() {
        if (ifEmpty()) {
            System.out.println("No existen elementos en la tabla");
        } else {
            System.out.println("Inserte cuenta de estudiante a remover: ");
            key = scan.nextInt();

            name = stdlist.remove(key);

            if (name == null) {
                System.out.println("No existe numero de cuenta");
            } else {
                System.out.println("Estudiante removido");
            }
        }
    }

    private void showName() {
        if (ifEmpty()) {
            System.out.println("No existen elementos en la tabla");
        } else {
            System.out.println("Ingrese cuenta de estudiante a buscar: ");

            key = scan.nextInt();

            name = stdlist.get(key);

            if (name == null) {
                System.out.println("No existe nombre asociado a cuenta");
            } else {
                System.out.println("Nombre asociado a cuenta: " + name);
            }
        }
    }

    private void mapSize() {
        key = stdlist.size();

        if (key == 0) {
            System.out.println("No existen elementos en tabla");
        } else {
            System.out.println("La cantidad de elementos en tabla es de " + key);
        }
    }

    private void containing() {
        if (ifEmpty()) {
            System.out.println("No existen elementos en la tabla");
        } else {
            String temp;
            System.out.println("Ingrese numero de cuenta del estudiante: ");
            key = scan.nextInt();
            name = stdlist.get(key);
            System.out.println("Ingrese nombre o apellido del estudiante a buscar: ");
            temp = scan.useDelimiter("\n").next();

            if (name.contains(temp)) {
                System.out.println("El nombre o apellido del estudiante corresponde al numero de cuenta");
            } else {
                System.out.println("El nombre o apellido del estudiante NO corresponde al numero de cuenta");
            }
        }
    }
}