import com.saga.demo.jwt.oficina.Oficina;
import com.saga.demo.jwt.util.RandomUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final List<Oficina> OFICINAS = new ArrayList<>();
    private static final RandomUtil RANDOM_UTIL = RandomUtil.getInstance();

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(nextListString(3));
        }

    }


    public static List<String> nextListString(int tam) {
        List<String> listString = new ArrayList<>();
        for (int i = 0; i < tam; i++) {
            listString.add(RANDOM_UTIL.nextString());
        }
        return listString;
    }

    public static List<String> acciones() {
        List<String> acciones = new ArrayList<>();
        String[] acc = new String[3];
        acc[0] = "Consultas";
        acc[1] = "Eventos";
        acc[2] = "Control Inmótico";
        int tam = RANDOM_UTIL.nextInt(4);
        for (int i = 0; i < tam; i++) {
            acciones.add(acc[i]);
        }
        return acciones;
    }
}
