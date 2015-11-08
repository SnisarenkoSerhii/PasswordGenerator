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
        System.out.println("3. Generate complex difficulty password.");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Enter the length of password(recommended length " +
                        "of password is between 8 and 32 symbols) : ");
                Scanner input2 = new Scanner(System.in);
                int length = input2.nextInt();
                m.simplePasswordGenerator(length);
            }
            break;

            case 2: {
                System.out.println("Enter the length of password(recommended length " +
                        "of password is between 8 and 32 symbols) : ");
                Scanner input2 = new Scanner(System.in);
                int length = input2.nextInt();
                m.mediumPasswordGenerator(length);
            }
            break;

            case 3: {
                System.out.println("Enter the length of password(recommended length " +
                        "of password is between 8 and 32 symbols) : ");
                Scanner input2 = new Scanner(System.in);
                int length = input2.nextInt();
                m.complexPasswordGenerator(length);
            }
            break;

            default:
                System.out.println("You entered wrong number.");
                break;
        }
    }
}
