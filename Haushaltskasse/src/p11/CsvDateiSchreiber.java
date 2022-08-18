//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package p11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class CsvDateiSchreiber {
    private static final String KOMMA_DELIMITER = ",";
    private static final String NEUE_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "id,vorname,nachname";

    public CsvDateiSchreiber() {
    }

    public static void schreibCsvDatei() {
        File datei = new File("src/p11/familyMitgliederDaten.csv");
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(datei);
            fileWriter.append("id,vorname,nachname".toString() + ",");
            fileWriter.append("\n");
            Iterator var2 = FamilieMitglieder.listeVonfamilieMitglieder.iterator();

            while (var2.hasNext()) {
                FamilieMitglieder familieMitglied = (FamilieMitglieder) var2.next();
                fileWriter.append(String.valueOf(familieMitglied.getFamilieMitgliedID()));
                fileWriter.append(",");
                fileWriter.append(familieMitglied.getVorname());
                fileWriter.append(",");
                fileWriter.append(familieMitglied.getNachname());
                fileWriter.append("\n");
            }

            System.out.println("CSV Datei wurde erstellt erfolgreich!");
        } catch (Exception var12) {
            System.out.println("Fehler im CsvFileWriter !!!");
            var12.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException var11) {
                System.out.println("Fehler beim Leeren/Schließen von fileWriter!");
                var11.printStackTrace();
            }

        }

    }
}
