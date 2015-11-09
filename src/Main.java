import java.util.Scanner;

/**
 * Created by Sergey on 07.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        Methods m = new Methods();

        System.out.println("Choose the item:");
        System.out.println("1. Generate simple password.");
        System.out.println("2. Generate medium difficulty password.");
        System.out.println("3. Generate complex password.");
        System.out.println("4. Generate several simple passwords.");
        System.out.println("5. Generate several medium difficulty passwords.");
        System.out.println("6. Generate several complex passwords.");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Enter the length of password: ");
                Scanner input2 = new Scanner(System.in);
                int length = input2.nextInt();
                System.out.println("Here is your password: ");
                m.simplePasswordGenerator(length);
            }
            break;

            case 2: {
                System.out.println("Enter the length of password: ");
                Scanner input2 = new Scanner(System.in);
                int length = input2.nextInt();
                System.out.println("Here is your password: ");
                m.mediumPasswordGenerator(length);
            }
            break;

            case 3: {
                System.out.println("Enter the length of password: ");
                Scanner input2 = new Scanner(System.in);
                int length = input2.nextInt();
                System.out.println("Here is your password: ");
                m.complexPasswordGenerator(length);
            }
            break;

            case 4: {
                System.out.println("Enter the length of password: ");
                Scanner input2 = new Scanner(System.in);
                int length = input2.nextInt();
                System.out.println("Enter the amount of password: ");
                Scanner input3 = new Scanner(System.in);
                int amount = input3.nextInt();
                System.out.println("Here is your passwords: ");
                for(int i = 0; i < amount; i++) {
                    m.simplePasswordGenerator(length);
                }
            }
            break;

            case 5: {
                System.out.println("Enter the length of password: ");
                Scanner input2 = new Scanner(System.in);
                int length = input2.nextInt();
                System.out.println("Enter the amount of password: ");
                Scanner input3 = new Scanner(System.in);
                int amount = input3.nextInt();
                System.out.println("Here is your passwords: ");
                for(int i = 0; i < amount; i++) {
                    m.mediumPasswordGenerator(length);
                }
            }
            break;

            case 6: {
                System.out.println("Enter the length of password: ");
                Scanner input2 = new Scanner(System.in);
                int length = input2.nextInt();
                System.out.println("Enter the amount of password: ");
                Scanner input3 = new Scanner(System.in);
                int amount = input3.nextInt();
                System.out.println("Here is your passwords: ");
                for(int i = 0; i < amount; i++) {
                    m.complexPasswordGenerator(length);
                }
            }
            break;

            default:
                System.out.println("You entered wrong number.");
                break;
        }
    }
}
