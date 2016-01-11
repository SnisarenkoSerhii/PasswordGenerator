import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sergey on 07.11.2015.
 */
public class Service {

    public static final char[] PULL_FOR_SIMPLE_PASSWORD = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D',
            'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
            'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static final char[] PULL_FOR_COMPLEX_PASSWORD = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D',
            'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
            'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!', '@', '#',
            '$', '%', '^', '&', '*'};

    public static void createPassword() throws IOException {
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
                Service.generateSimplePassword();
            }
            break;

            case 2: {
                Service.generateMediumPassword();
            }
            break;

            case 3: {
                Service.generateComplexPassword();
            }
            break;

            case 4: {
                Service.generateManySimplePasswords();
            }
            break;

            case 5: {
                Service.generateManyMediumPasswords();
            }
            break;

            case 6: {
                Service.generateManyComplexPasswords();
            }
            break;

            default:
                System.out.println("You entered wrong number.");
                break;
        }

    }

    public static void generateManyComplexPasswords() throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(new File(("C:\\Users\\Sergey\\Desktop\\GeneratedPasswords.txt"))));
        ComplexPassword complexPassword = new ComplexPassword();
        System.out.println("Enter the length of password: ");
        Scanner input2 = new Scanner(System.in);
        int length = input2.nextInt();
        System.out.println("Enter the amount of password: ");
        Scanner input3 = new Scanner(System.in);
        int amount = input3.nextInt();

        String[] passwords = new String[amount];

        System.out.println("Here is your passwords: ");
        for (int i = 0; i < amount; i++) {
            passwords[i] = Service.toString(complexPassword.complexPasswordGenerator(length));
        }
        out.write(Arrays.toString(passwords));
        out.close();
    }

    public static void generateManyMediumPasswords() throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(new File(("C:\\Users\\Sergey\\Desktop\\GeneratedPasswords.txt"))));

        MediumPassword mediumPassword = new MediumPassword();
        System.out.println("Enter the length of password: ");
        Scanner input2 = new Scanner(System.in);
        int length = input2.nextInt();
        System.out.println("Enter the amount of password: ");
        Scanner input3 = new Scanner(System.in);
        int amount = input3.nextInt();

        String[] passwords = new String[amount];

        System.out.println("Here is your passwords: ");
        for (int i = 0; i < amount; i++) {
            passwords[i] = Service.toString(mediumPassword.mediumPasswordGenerator(length));
        }
        out.write(Arrays.toString(passwords));
        out.close();
    }

    public static void generateManySimplePasswords() throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(new File(("C:\\Users\\Sergey\\Desktop\\GeneratedPasswords.txt"))));

        SimplePassword simplePassword = new SimplePassword();
        System.out.println("Enter the length of password: ");
        Scanner input2 = new Scanner(System.in);
        int length = input2.nextInt();
        System.out.println("Enter the amount of password: ");
        Scanner input3 = new Scanner(System.in);
        int amount = input3.nextInt();

        String[] passwords = new String[amount];

        System.out.println("Here is your passwords: ");
        for (int i = 0; i < amount; i++) {
            passwords[i] = Service.toString(simplePassword.simplePasswordGenerator(length));
        }
        out.write(Arrays.toString(passwords));
        out.close();
    }

    public static void generateComplexPassword() throws IOException {
        ComplexPassword complexPassword = new ComplexPassword();
        System.out.println("Enter the length of password: ");
        Scanner input2 = new Scanner(System.in);
        int length = input2.nextInt();
        System.out.println("Here is your password: ");
        complexPassword.complexPasswordGenerator(length);
    }

    public static void generateMediumPassword() throws IOException {
        MediumPassword mediumPassword = new MediumPassword();
        System.out.println("Enter the length of password: ");
        Scanner input2 = new Scanner(System.in);
        int length = input2.nextInt();
        System.out.println("Here is your password: ");
        mediumPassword.mediumPasswordGenerator(length);
    }

    public static void generateSimplePassword() throws IOException {
        SimplePassword simplePassword = new SimplePassword();
        System.out.println("Enter the length of password: ");
        Scanner input2 = new Scanner(System.in);
        int length = input2.nextInt();
        System.out.println("Here is your password: ");
        simplePassword.simplePasswordGenerator(length);
    }


    public static String toString(char[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.toString();
        }
    }
}
