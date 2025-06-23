
import java.util.Scanner;

public class Main {

    static String[][] results = new String[3][3];

    static void generateInformation() {
        int count = 1;
        for (int i = 0; i < results[0].length; i++) {
            for (int j = 0; j < results[i].length; j++) {
                results[i][j] = Integer.toString(count);
                count++;
            }
        }
    }

    static void printDahsboard() {
        for (int i = 0; i < results[0].length; i++) {
            System.out.println("|---|---|---|");
            System.out.print("|");

            for (String element : results[i]) {
                System.out.print(" " + element + " |");
            }
            System.err.println();
        }
        System.out.println("|---|---|---|");
    }

    static void writeUserInformation(int number, String variable) {
        if (number > 0 && number < 4) {
            results[0][(number - 1)] = variable;
        } else if (number > 3 && number < 7) {
            results[1][(number - 4)] = variable;
        } else {
            results[1][(number - 7)] = variable;
        }


    }

    static boolean checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = null;

            switch (a) {
                case 0:
                    line = results[0][0] + results[0][1] + results[0][2];
                    break;
                case 1:
                    line = results[1][0] + results[1][1] + results[1][2];
                    break;
                case 2:
                    line = results[2][0] + results[2][1] + results[2][2];
                    break;
                case 3:
                    line = results[0][0] + results[1][0] + results[2][0];
                    break;
                case 4:
                    line = results[0][1] + results[1][1] + results[2][1];
                    break;
                case 5:
                    line = results[0][2] + results[1][2] + results[2][2];
                    break;
                case 6:
                    line = results[0][0] + results[1][1] + results[2][2];
                    break;
                case 7:
                    line = results[2][0] + results[1][1] + results[0][2];
                    break;
            }
            //For X winner
            if (line.equals("XXX")) {
                return true;
            } // For O winner
            else if (line.equals("OOO")) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Lets play the gameboard");
        generateInformation();
        printDahsboard();

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Select your number to mark a X");
            int numUser1 = scan.nextInt();
            writeUserInformation(numUser1, "X");
            printDahsboard();
            if(checkWinner()){
                System.out.println("You win the game");
                break;
            }

            System.out.println("Select your number to mark a O");
            int numUser2 = scan.nextInt();
            writeUserInformation(numUser2, "O");
            printDahsboard();

            if(checkWinner()){
                System.out.println("You win the game");
                break;
            }

        }

    }
}
