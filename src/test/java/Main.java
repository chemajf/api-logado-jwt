import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.saga.demo.jwt.archivo.DescargaFichero;
import com.saga.demo.jwt.oficina.Oficina;
import com.saga.demo.jwt.util.RandomUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final List<Oficina> OFICINAS = new ArrayList<>();
    private static final RandomUtil RANDOM_UTIL = RandomUtil.getInstance();

    public static void main(String[] args) {
        System.out.println(archivosDeDescarga());
    }

    private static String archivosDeDescarga() {
        List<DescargaFichero> l = new ArrayList<>();
        l.add(new DescargaFichero().tipo("pdf").titulo("El PDF de la tabla").url("https://www.odfenergia.es/wp-content/uploads/2016/10/518046-elEconomista.pdf"));
        l.add(new DescargaFichero().tipo("xls").titulo("El XLS de la tabla").url("https://www.odfenergia.es/wp-content/uploads/2018/06/Condiciones-Generales_ODF_E.pdf"));
        System.out.println(l.toString());
        JsonNode jsonNode = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            jsonNode = objectMapper.readTree(l.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonNode.toString();
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

    private static void getRandomTable(int columnas, int filas) {
        String tabla = "{\n";

        String identificador = "\"identificador\": \"" + RANDOM_UTIL.nextString().replaceAll(" ", "_").toLowerCase() + "\",\n";
        String titulo = "\"titulo\": \"" + RANDOM_UTIL.nextString() + "\",\n";

        String fields = "\"fields\": [\"Horas\",";
        for (int k = 1; k <= columnas - 2; k++) {
            fields += "\"" + k + "\",";
        }
        fields += "\"Total\"],";

        String datas = "\"datas\": [\n";
        for (int k = 0; k < filas; k++) {
            String data = "{\"Horas\":{\"value\": " + RANDOM_UTIL.nextInt(99) + ",\"metas\": {}},";
            for (int i = 1; i <= columnas - 2; i++) {
                data += "\"" + i + "\":{\"value\":" + RANDOM_UTIL.nextInt(99) + ",\"metas\": {" + RANDOM_UTIL.nextColorJson() + "}},";
            }
            data += "\"Total\":{\"value\":" + RANDOM_UTIL.nextInt(99) + ",\"metas\": {}}}";
            if (k < filas - 1)
                data += ",";
            datas += data + "\n";
        }
        datas += "]\n";

        tabla += identificador;
        tabla += titulo;
        tabla += fields;
        tabla += datas;

        tabla += "}";

        System.out.println(tabla);
    }

}
