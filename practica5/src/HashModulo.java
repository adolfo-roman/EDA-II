import java.util.LinkedList;
import java.util.Scanner;

public class HashModulo {

    LinkedList <Integer> lst = new LinkedList<>();

    public HashModulo()
    {
        for (int i = 0; i < 20; i++) {
            lst.add(null);
        }
    }

    Scanner scan = new Scanner(System.in);
    int elements = 0;

    public void moduleMenu()
    {
        int option;

        do {
            do {
                if(elements != 20) {
                    System.out.println("1) Agregar elementos");
                }

                System.out.println("2) Imprimir lista");
                System.out.println("3) Buscar elementos");
                System.out.println("4) Regresar");

                option = scan.nextInt();
            }
            while(option < 1 || option > 4);

            swMenu(option);

        }
        while(option != 4);
    }

    private void swMenu(Integer option)
    {
        switch (option) {
            case 1:
                addElement();
                break;
            case 2:
                print();
                break;
            case 3:
                search();
                break;
        }
    }

    private void addElement()
    {
        System.out.println("Ingrese elemento: ");
        int val = scan.nextInt();
        int sum = folding(val);
        probing(val, sum);
    }

    private int folding(Integer val)
    {
        int sum = val % 10;
        val = val / 10;

        for (int i = 0; i < 2; i++) {
            sum += val % 10000;
            val = val / 10000;
        }
        return sum;
    }

    private void probing(Integer val, Integer sum)
    {
        int index;

        for (int i = 0; i < 20; i++) {
            index = (sum % 20 + i) % 20;
            if(lst.get(index) == null)
            {
                lst.set(index,val);
                System.out.println("Elemento: " + val + " almacenado en indice: " + index);
                elements++;
                break;
            }
        }
    }

    private void print()
    {
        for (int i = 0; i < 20; i++) {
            System.out.println("Indice: " + i + ", Valor: " + lst.get(i));
        }
    }

    private void search()
    {
        System.out.println("Ingrese elemento a buscar: ");
        int val = scan.nextInt();
        int sum = folding(val);
        searching(val, sum);
    }

    private void searching(Integer val, Integer sum)
    {
        int index;
        boolean found = false;

        for (int i = 0; i < 20; i++) {

            index = (sum % 20 + i) % 20;

            try {
                if(lst.get(index).equals(val))
                {
                    found = true;
                    System.out.println("Elemento: " + val + " se encuentra en indice: " + index);
                }
            }catch (NullPointerException e)
            {
                //do nothing;
            }
        }

        if(!found)
        {
            System.out.println("Elemento no se encuentra en la tabla");
        }
    }
}
