//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package p11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FamilieMitglieder {
    long familieMitgliedID;
    long familieMitgliedID_static;
    String vorname;
    String nachname;
    static List<FamilieMitglieder> listeVonfamilieMitglieder = new ArrayList();
    private static Scanner scanner;
    private static boolean falscheName = true;

    public FamilieMitglieder(String vorname, String nachname) {
        this.familieMitgliedID = this.familieMitgliedID_static;
        this.vorname = vorname;
        this.nachname = nachname;
        ++this.familieMitgliedID_static;
    }

    public FamilieMitglieder(long l, String vorname, String nachname) {
        this(vorname, nachname);
        this.familieMitgliedID = l;
    }

    public void accountErstellen() {
        System.out.print("Eingeben Sie bitte Vorname: ");
        vorname = nameEintragen();
        if (!falscheName) Haushaltskasse.haushaltskasse();
        System.out.print("Eingeben Sie bitte Nachname: ");
        nachname = nameEintragen();
        FamilieMitglieder familieMitglieder = new FamilieMitglieder(this.familieMitgliedID, vorname, nachname);
        listeVonfamilieMitglieder.add(familieMitglieder);
    }

    private static String nameEintragen() {
        int limit = 20;
        String name = "";
        int wiederholung = 1;
        while (true) {
            scanner= new Scanner(System.in);
            name = scanner.nextLine();
            System.out.println(name);
            if (name.length() >= 1 && name.length() <= limit) {
                return name;
            } else if (wiederholung < 3) {
                System.out.println(" The input does not meet the requirements , Please re-enter :");
                wiederholung = wiederholung + 1;
                continue;
            } else {
                falscheName = false;
                break;
            }
        }
//        return "";
        return name;
    }

    public long getFamilieMitgliedID() {
        return this.familieMitgliedID;
    }

    public String getVorname() {
        return this.vorname;
    }

    public String getNachname() {
        return this.nachname;
    }

    public static List<FamilieMitglieder> getListeVonfamilieMitglieder() {
        return listeVonfamilieMitglieder;
    }

    public String toString() {
        return "FamilieMitglieder{familieMitgliedID=" + this.familieMitgliedID + ", familieMitgliedID_static=" + this.familieMitgliedID_static + ", vorname='" + this.vorname + "', nachname='" + this.nachname + "'}";
    }

}
