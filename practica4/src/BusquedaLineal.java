import java.util.List;
import java.util.Objects;

public class BusquedaLineal {

    public static void boolSearch(List<Integer> lista, Integer clave)
    {
        boolean search = false;

        for (Integer integer : lista) {
            if (Objects.equals(integer, clave)) {
                search = true;
                break;
            }
        }
        System.out.println(search);
    }

    public static void indexSearch(List<Integer> lista, Integer clave)
    {
        for (int i = 0; i < lista.size(); i++) {
            if (Objects.equals(lista.get(i), clave)) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void timesSearch(List<Integer> lista, Integer clave)
    {
        int count = 0;
        for (Integer integer : lista) {
            if (Objects.equals(integer, clave)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void searchBrandPC(List<Computadora> pcList, String marca)
    {
        for (Computadora pc: pcList) {
            if(Objects.equals(pc.getMarca(), marca))
            {
                System.out.println(pc.toStringStore());
                System.out.println(pc.toStringSpecs());
            }
        }
    }

    public static void searchRamPC(List<Computadora> pcList, int ram)
    {
        for (Computadora pc: pcList) {
            if(Objects.equals(pc.getRam(), ram))
            {
                System.out.println(pc.toStringStore());
                System.out.println(pc.toStringSpecs());
            }
        }
    }

}
