import java.util.LinkedList;
import java.util.List;

public class ListaComputadoras {

    public static void main(String[] args)
    {
        List<Computadora> listaPC = new LinkedList<>();

        Computadora a = new Computadora("Compaq", 137.56, "Escritorio");
        a.setRam(8);
        a.setOs("WIndows");
        a.setProcesador("Pentium");

        Computadora b = new Computadora("Toshiba", 253.80, "Lap Top");
        b.setRam(12);
        b.setOs("Debian");
        b.setProcesador("AMD");

        Computadora c = new Computadora("Acer", 456.25, "Escritorio");
        c.setRam(4);
        c.setOs("Chrome OS");
        c.setProcesador("Xeon");

        listaPC.add(a);
        listaPC.add(b);
        listaPC.add(c);

        System.out.println("Lista de computadoras: ");
        printPCList(listaPC);

        System.out.println("Busqueda lineal \"Compaq\"");
        BusquedaLineal.searchBrandPC(listaPC, "Compaq");
        System.out.println();

        System.out.println("Busqueda lineal \"RAM: 4\"");
        BusquedaLineal.searchRamPC(listaPC, 4);
        System.out.println();

        System.out.println("Busqueda Binaria \"Marca: Toshiba\"");
        BusquedaBinaria.binBrandSearch(listaPC, "Toshiba", 0, listaPC.size());
        System.out.println();
    }

    public static void printPCList(List<Computadora> pcList)
    {
        for (Computadora pc: pcList) {
            System.out.println(pc.toStringStore());
            System.out.println(pc.toStringSpecs());
        }
    }

}
