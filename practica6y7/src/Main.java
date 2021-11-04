import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int option;

        do
        {
            option = menu1();

            switch (option)
            {
                case 1:
                    option1();
                    break;
                case 2:
                    option2();
                    break;
                case 3:
                   option3();
                    break;
                case 4:
                    option4();
                    break;
            }
        }
        while (option != 5);
    }

    public static int menu1()
    {
        Scanner scan = new Scanner(System.in);
        int menu1;

        do
        {
            System.out.println("1) Grafo No Dirigido");
            System.out.println("2) Grafo Dirigido");
            System.out.println("3) Grafo Ponderado No Dirigido");
            System.out.println("4) Grafo Ponderado Dirigido");
            System.out.println("5) Salir");

            menu1 = scan.nextInt();
        }
        while (menu1 < 1 || menu1 > 5);

        return menu1;
    }

    public static int menu2()
    {
        Scanner scan = new Scanner(System.in);
        int menu2;

        do
        {
            System.out.println("1) Agregar Conexiones");
            System.out.println("2) Imprimir Lista de Adyacencia");
            System.out.println("3) Imprimir BFS");
            System.out.println("4) Imprimir DFS");
            System.out.println("5) Salir");

            menu2 = scan.nextInt();
        }
        while (menu2 < 1 || menu2 > 5);

        return menu2;
    }

    public static int menu3()
    {
        Scanner scan = new Scanner(System.in);
        int menu3;

        do
        {
            System.out.println("1) Agregar Conexiones");
            System.out.println("2) Imprimir Lista de Adyacencia");
            System.out.println("3) Imprimir BFS");
            System.out.println("4) Imprimir DFS");
            System.out.println("5) Primm's Algorithm");
            System.out.println("6) Salir");

            menu3 = scan.nextInt();
        }
        while (menu3 < 1 || menu3 > 6);

        return menu3;
    }

    public static void option1()
    {
        Graph uGraph = new Graph();
        int option1;

        do
        {
            option1 = menu2();

            switch (option1)
            {
                case 1:
                    uGraph.setEdges("u","r");
                    break;
                case 2:
                    uGraph.printGraph();
                    break;
                case 3:
                    uGraph.BFS();
                    break;
                case 4:
                    uGraph.DFS();
                    break;
            }
        }
        while (option1 != 5);
    }

    public static void option2()
    {
        Graph dGraph = new Graph();
        int option2;

        do
        {
            option2 = menu2();

            switch (option2)
            {
                case 1:
                    dGraph.setEdges("d", "r");
                    break;
                case 2:
                    dGraph.printGraph();
                    break;
                case 3:
                    dGraph.BFS();
                    break;
                case 4:
                    dGraph.DFS();
                    break;
            }
        }
        while (option2 != 5);
    }

    public static void option3()
    {
        Graph uPGraph = new Graph();
        int option3;

        do
        {
            option3 = menu3();

            switch (option3)
            {
                case 1:
                    uPGraph.setEdges("u", "p");
                    break;
                case 2:
                    uPGraph.printPGraph();
                    break;
                case 3:
                    uPGraph.BFS();
                    break;
                case 4:
                    uPGraph.DFS();
                    break;
                case 5:
                    uPGraph.primm();
                    break;
            }
        }
        while (option3 != 5);
    }

    public static void option4()
    {
        Graph dPGraph = new Graph();
        int option4;

        do
        {
            option4 = menu3();

            switch (option4)
            {
                case 1:
                    dPGraph.setEdges("d", "p");
                    break;
                case 2:
                    dPGraph.printPGraph();
                    break;
                case 3:
                    dPGraph.BFS();
                    break;
                case 4:
                    dPGraph.DFS();
                    break;
                case 5:
                    dPGraph.primm();
                    break;
            }
        }
        while (option4 != 5);
    }
}