
import java.util.List;
import java.util.Objects;

public class BusquedaBinaria {

    public static void binBoolSearch(List<Integer> lista, Integer clave) {

        int right = lista.size() - 1;
        int mid;
        int left = 0;

        boolean found = false;

        while (left <= right) {

            mid = (left + right) / 2;

            if (lista.get(mid).equals(clave)) {
                found = true;
                break;
            }
            if (clave < lista.get(mid)) {
                right = mid - 1;
            }
            if (clave > lista.get(mid)) {
                left = mid + 1;
            }
        }
        System.out.println(found);
    }

    public static void binTimesSearch(List<Integer> lista, Integer clave) {

        int a = lista.size();
        int b = 1;
        int mid;
        int times = 0;
        int left;
        int right;

        while(b <= a) {

            mid = (a + b)/2;

            if (lista.get(mid).equals(clave)) {

                times++;

                left = mid - 1 ;
                right = mid + 1;

                do {

                    if (lista.get(left).equals(clave)) {
                        times++;
                        left--;
                    }

                    if (lista.get(right).equals(clave)) {
                        times++;
                        right++;
                    }
                }
                while (Objects.equals(lista.get(left), clave) || Objects.equals(lista.get(right), clave));
                break;
            }

            if (clave < lista.get(mid)) {
                a = mid - 1;
            }
            if (clave > lista.get(mid)) {
                a = mid + 1;
            }
        }
        System.out.println(times);
    }

    public static void binBrandSearch(List<Computadora> listaPC, String brand, Integer start, Integer end) {

        listaPC = listaPC.subList(start, end);

        int mid = (end - 1)/2;

        if(listaPC.size() == 1) {

            if(Objects.equals(listaPC.get(0).getMarca(), brand)) {
                System.out.println(true);
                return;
            }
            return;
        }
        binBrandSearch(listaPC, brand, 0, mid + 1);
        binBrandSearch(listaPC, brand, mid + 1, listaPC.size());
    }
}
