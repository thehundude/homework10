package homework10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SacramentoUtil {
    public static void printCSVFromSacramentoList(ArrayList<Sacramento> sacramentos, String path) throws IOException {
        FileWriter writer = new FileWriter(path);
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write(sacramentos.toString());
        buffer.close();
    }

    public static void findBiggestGridByDistricts(ArrayList<Sacramento> sacramentos) {
        HashMap<Integer, Sacramento> sacramentoHashMap = new HashMap<>();

        // végigmegy a Sacramento-kon
        for (Sacramento i : sacramentos) {
            // ellenőrzi, van-e már ilyen district
            if (sacramentoHashMap.containsKey(i.getDistrict()) == true) {
                // ha van, összehasonlítja a HashMap-ben lévő Sacramento grid értékét az i grid értékével
                if (sacramentoHashMap.get(i.getDistrict()).getGrid() < i.getGrid()) {
                    sacramentoHashMap.put(i.getDistrict(), i);
                }
            }
            else {
                sacramentoHashMap.put(i.getDistrict(), i);
            }
        }

        // HashMap kiíratás
        for (Map.Entry item : sacramentoHashMap.entrySet()) {
            System.out.println(item.getValue());
        }
    }
}
