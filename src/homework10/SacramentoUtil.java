package homework10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SacramentoUtil {
    public static void printCSVFromSacramentoList(ArrayList<Sacramento> sacramentos, String path) throws IOException {
        FileWriter writer = new FileWriter(path);
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write(sacramentos.toString());
        buffer.close();
    }
}
