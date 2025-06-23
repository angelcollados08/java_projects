
import java.util.Random;
import java.util.Scanner;

public class Password {

    public static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
	public static final String NUMBERS = "1234567890";
	public static final String SYMBOLS = "!@#$%^&*()-_=+\\/~?";

    public static String generatePassword(int size, boolean uppercase, boolean lowercase, boolean numbers, boolean symbols) {
        String passwordCharacters = "";
        String res = "";
        if(uppercase) passwordCharacters = passwordCharacters.concat(UPPERCASE_LETTERS);
        if(lowercase) passwordCharacters = passwordCharacters.concat(LOWERCASE_LETTERS);
        if(numbers) passwordCharacters = passwordCharacters.concat(NUMBERS);
        if(symbols) passwordCharacters = passwordCharacters.concat(SYMBOLS);

        //To generate random letters from uppercase
        Random random = new Random();
        for(int i = 0; i < size; i++){
            res = res.concat(Character.toString(passwordCharacters.charAt(random.nextInt(passwordCharacters.length()))));
        }

        return res;
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("We are goint to create a password");
        System.out.println("Wrtie the number of characters for the password");
        int size = Integer.parseInt(scan.nextLine());

        System.out.println("Do you want uppercase: Yes/No");
        boolean uppercase = ("Yes".equals(scan.nextLine()));

        System.out.println("Do you want lowercase: Yes/No");
        boolean lowercase = ("Yes".equals(scan.nextLine()));

        System.out.println("Do you want numbers: Yes/No");
        boolean numbers = ("Yes".equals(scan.nextLine()));

        System.out.println("Do you want symbols: Yes/No");
        boolean symbols = ("Yes".equals(scan.nextLine()));

        String password = Password.generatePassword(size, uppercase, lowercase, numbers, symbols);

        System.out.println("This is the password generated: " + password);

    }
}
