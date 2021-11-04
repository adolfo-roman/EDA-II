import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Encadenamiento {

    List<ArrayList<Integer>> masterList = new ArrayList<>();

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    public Encadenamiento()
    {
        for (int i = 0; i < 15; i++) {
            ArrayList<Integer> sublista = new ArrayList<>();
            masterList.add(sublista);
        }
    }

    public void menuEncadenamiento() {
        int option;
        do {
            do {
                System.out.println("1) Agregar elemento");
                System.out.println("2) Salir");

                option = scan.nextInt();
            }
            while (option < 1 || option > 2);

            allTheStuffThisDoes(option);

        }
        while (option != 2);
    }

    private void allTheStuffThisDoes(Integer option)
    {
        if (option == 1) {
            addElement();
            print();
        }
    }

    private void addElement(){

        System.out.println("Ingrese elemento a agregar: ");

        int element = scan.nextInt();
        int index = rand.nextInt(15);

        masterList.get(index).add(element);
    }

    private void print()
    {
        for (int i = 0; i < 15; i++) {
            System.out.println("Lista " + (i + 1) + " : " + masterList.get(i));
        }
    }
}
