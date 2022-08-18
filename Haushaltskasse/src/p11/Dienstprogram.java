package p11;

import java.util.Scanner;

public class Dienstprogram {
    private static Scanner scanner = new Scanner(System.in);

    // Selection of interface menu
    public static char liesMenueauswahl() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4' && c != '5') {
                System.out.println(" Wrong choice , Please re-enter ：");
            } else break;
        }
        return c;
    }

    // Input of income and expenditure amount , No more than 4 position
    public static int readNumber() {

        int n;
        for (; ; ) {

            String str = readKeyBoard(4);
            try {

                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {

                System.out.println(" Wrong number input , Please re-enter :");
            }
        }
        return n;
    }

    // Input for income and expense statements , No more than 8 position
    public static String readString() {

        String str = readKeyBoard(8);
        return str;
    }

    // Input to confirm selection , Read... From the keyboard “Y”“N”, And take it as the return value of the method
    public static char readConfirmSelection() {

        char c;
        for (; ; ) {

            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {

                break;
            } else {

                System.out.println(" Wrong choice , Please re-enter :");
            }
        }
        return c;
    }

    public static String readKeyBoard(int limit) {

        String line = "";
        while (scanner.hasNext()) {

            line = scanner.nextLine();
            if (line.length() < 1 || line.length() > limit) {

                System.out.println(" The input does not meet the requirements , Please re-enter :");
                continue;
            }
            break;
        }
        return line;
    }
}
