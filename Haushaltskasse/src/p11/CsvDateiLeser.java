package p11;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import p11.FamilieMitglieder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class CsvDateiLeser {
    private static final String COMMA_DELIMITER = ",";
    private static final int MITGLIED_ID_IDX = 0;
    private static final int MITGLIED_VORNAME_IDX = 1;
    private static final int MITGLIED_NACHNAME_IDX = 2;
    static File datei = new File("src/p11/familyMitgliederDaten.csv");

    public CsvDateiLeser() {
    }

    public static void readCsvFile() {
        BufferedReader fileReader = null;

        try {
            new ArrayList();
            String line = "";
            fileReader = new BufferedReader(new FileReader(datei));
            fileReader.readLine();

            FamilieMitglieder mitglied;
            while ((line = fileReader.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length > 0) {
                    mitglied = new FamilieMitglieder(Long.parseLong(tokens[0]), tokens[1], tokens[2]);
                    FamilieMitglieder.listeVonfamilieMitglieder.add(mitglied);
                }
            }

            System.out.println("Liste von Familie: ");
            Iterator var15 = FamilieMitglieder.listeVonfamilieMitglieder.iterator();

            while (var15.hasNext()) {
                mitglied = (FamilieMitglieder) var15.next();
                System.out.println(mitglied.toString());
            }
        } catch (Exception var13) {
            System.out.println("Error in CsvFileReader !!!");
            var13.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException var12) {
                System.out.println("Error while closing fileReader !!!");
                var12.printStackTrace();
            }

        }

    }
}
