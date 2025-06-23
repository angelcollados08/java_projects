
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        boolean userLogged = false;
        BankManagement bank = new BankManagement();
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to your bank, in order to perform an action you have to select a number");
        System.out.println("1)Create a User");
        System.out.println("2)Loggin a User");


        int selection = Integer.parseInt(scan.nextLine());

        switch (selection) {
            case 1:
                System.out.println("Insert a name for your account");
                String name = scan.nextLine();
                System.out.println("Insert the password with numbers");
                int passCode = Integer.parseInt(scan.nextLine());
                if(bank.createAccount(name, passCode)){
                    System.out.println("Account created succesfully");
                }
                else{
                    System.out.println("Acoount not created");
                }
                break;
            case 2:
                System.out.println("Insert your user name");
                String nameLoged = scan.nextLine();
                System.out.println("Insert the password");
                int passCodeLogged = Integer.parseInt(scan.nextLine());
                if(bank.loginUser(nameLoged, passCodeLogged)){
                    userLogged = true;
                    System.out.println("Congratulations you are Loged");
                }else{
                    System.out.println("Credentials incorrect");

                }
                break;
            default:
                System.out.println("You did't enter a correct a number");
        }
    }
    
}
