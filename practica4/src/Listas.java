import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Listas
{
    public static void main(String[] args)
    {
        List<Integer> lista1 = new LinkedList<>();
        List<Integer> lista2 = new LinkedList<>();
        List<Integer> lista3 = new LinkedList<>();
        List<Integer> lista4 = new LinkedList<>();

        System.out.println("Lista con elementos no repetidos");
        llenarLista(lista1, 20);

        imprimirLista(lista1);
        System.out.println();

        System.out.println("Buscando elemento 15 en lista: ");

        BusquedaLineal.boolSearch(lista1, 15);
        System.out.println();

        System.out.println("Buscando elemento 25 en lista: ");

        BusquedaLineal.boolSearch(lista1, 25);
        System.out.println();

        System.out.println("Indice de elemento 15 en lista: ");

        BusquedaLineal.boolSearch(lista1, 15);
        System.out.println();

        System.out.println("Indice de elemento 25 en lista: ");

        BusquedaLineal.boolSearch(lista1, 25);
        System.out.println();

        System.out.println("***BUSQUEDA BINARIA***");

        System.out.println("Lista con elementos repetidos: ");

        llenarListaRep(lista2, 10, 4);

        imprimirLista(lista2);
        System.out.println();

        System.out.println("Numero de veces elemento 4 repetido: ");

        BusquedaBinaria.binTimesSearch(lista2, 4);

        /*****************************/

        System.out.println();


        System.out.println("Lista con elementos no repetidos");
        llenarLista(lista3, 14);

        imprimirLista(lista3);
        System.out.println();

        System.out.println("Buscando elemento 5 en lista: ");

        BusquedaBinaria.binBoolSearch(lista3, 5);
        System.out.println();

        System.out.println("Buscando elemento 30 en lista: ");

        BusquedaBinaria.binBoolSearch(lista3, 15);
        System.out.println();

    }

    public static void imprimirLista(List<Integer> listaPrint)
    {
        for(Integer var : listaPrint)
        {
            System.out.printf(var + " ");
        }
        System.out.println();
    }

    public static void llenarLista(List<Integer> lista, Integer size)
    {
        for (int i = 0; i < size; i++) {
            lista.add(i + 1);
        }
    }

    public static void llenarListaRep(List<Integer> lista, Integer size, Integer repeat)
    {
        for (int i = 0; i < size; i++) {
            lista.add(i + 1);
            if (i + 1 == repeat)
            {
                for (int j = 0; j < repeat; j++) {
                    lista.add(repeat);
                }
            }
        }
    }
}

