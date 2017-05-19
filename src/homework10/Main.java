package homework10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        // ArrayList, amibe beíratjuk majd a sorokat
        ArrayList<Sacramento> sacramentoCrime = new ArrayList<>();

        // fájl beolvasás
        FileReader file = new FileReader("C:\\Users\\tamas\\OneDrive\\Dokumentumok\\Java képzés\\Backend\\9 hét\\SacramentocrimeJanuary2006.txt");
        try (BufferedReader br = new BufferedReader(file)) {
            String line;
            while ((line = br.readLine()) != null) {
                // line.split-tel szétválasztjuk a vesszőknél
                String[] row = line.split(",");

                Sacramento sacramento = new Sacramento();

                sacramento.setCdatetime(row[0]);
                sacramento.setAddress(row[1]);
                sacramento.setDistrict(Integer.parseInt(row[2]));
                sacramento.setBeat(row[3]);
                sacramento.setGrid(Integer.parseInt(row[4]));
                sacramento.setCrimedescr(row[5]);
                sacramento.setUcr_ncic_code(Integer.parseInt(row[6]));
                sacramento.setLatitude(Double.parseDouble(row[7]));
                sacramento.setLongitude(Double.parseDouble(row[8]));

                // hozzáadjuk a sort a sacramentoCrime ArrayList-hez
                sacramentoCrime.add(sacramento);
            }
        }

        /*
        // foreach kiíratás
        for (Sacramento i : sacramentoCrime) {
            System.out.println(i.toString());
        }
        */

        // #1 printCSVFromSacramentoList method
        // kell lennie egy testdir mappának a C:-n, különben hibát dob
        SacramentoUtil.printCSVFromSacramentoList(sacramentoCrime, "C:\\testdir\\NewSacramento.csv");
        System.out.println("Kész.");
    }
}
