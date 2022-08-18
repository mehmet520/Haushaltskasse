package p11;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Haushaltskasse {

    public static void haushaltskasse(){
        FamilieMitglieder obj = new FamilieMitglieder("Mehmet", "Yilmaz");

        String details = " Income and expenditure \t Amount of account \t Amount of revenue and expenditure \t explain \n";
        boolean isFlag = true;
        int balance = 10000;
        while (isFlag) {

            System.out.println("\n*** Willkommen bei der Haushaltsbuchhaltungssoftware ***\n");
            System.out.println(" 1 Angaben zu Einnahmen und Ausgaben "); //Income and expenditure details
            System.out.println(" 2 Registriertes Einkommen ");  // Registered income
            System.out.println(" 3 Ausgaben registrieren ");    // Register expenses
            System.out.println(" 4 Neue Benutzer registrieren ");
            System.out.println(" 5 abmelden \n");
            System.out.print("Bitte wählen Sie <1-5>:");

// Get user's choice
            char selection = Dienstprogram.liesMenueauswahl();
            switch (selection) {

                case '1':
//System.out.println("1 Income and expenditure details ");
                    System.out.println("----------------- Current revenue and expenditure details record -----------------");
                    System.out.println(details);
                    System.out.println("--------------------------------------------------");
                    break;
                case '2':
//System.out.println("2 Registered income ");
                    System.out.print(" The amount of income this time :");
                    int money = Dienstprogram.readNumber();
                    System.out.println(" This income statement :");
                    String info = Dienstprogram.readString();
                    balance += money;
                    details += " income \t" + balance + "\t" +
                            money + "\t\t\t" + info + "\n";
                    System.out.println("--------------------- Registration completed ---------------------");
                    break;
                case '3':
//System.out.println("3 Register expenses ");
                    System.out.println(" The amount of this expenditure is :");
                    int money1 = Dienstprogram.readNumber();
                    System.out.println(" This expenditure statement :");
                    String info1 = Dienstprogram.readString();
                    if (balance >= money1) {

                        balance -= money1;
                    } else {

                        System.out.println(" The expenditure exceeds the account limit , Failure to pay ");
                    }
                    details += " spending \t" + balance + "\t" +
                            money1 + "\t\t\t" + info1 + "\n";
                    System.out.println("--------------------- Registration completed ---------------------");
                    break;
                case '4':
//System.out.println("1 Income and expenditure details ");
                    System.out.println("*** Neue Benutzer Registration ***");
                    obj.accountErstellen();
                    break;

                case '5':
//System.out.println("4 sign out ");
                    System.out.println(" Confirm whether to exit <y/n>");
                    char isExit = Dienstprogram.readConfirmSelection();
                    if (isExit == 'Y') {

                        isFlag = false;
                    }
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Haushaltskasse obj = new Haushaltskasse();
        obj.haushaltskasse();
        System.out.println("Liste von Familie: \n" + FamilieMitglieder.listeVonfamilieMitglieder);
        CsvDateiSchreiber.schreibCsvDatei();
        CsvDateiLeser.readCsvFile();
        System.out.println("Liste von Familie: \n" + FamilieMitglieder.listeVonfamilieMitglieder);
    }
}
