import java.util.Arrays;
import java.util.Random;

/**
 * Created by Sergey on 07.11.2015.
 */
public class Methods {
    private char[] smallPassword;
    private char[] prefix;
    private char[] complexPassword;
    private char[] pullForSimplePassword = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
            'o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D',
            'E','F','G','H','I','J','K','L','M','N', 'O','P','Q','R','S','T','U',
            'V','W','X','Y','Z','0','1', '2', '3', '4', '5', '6', '7', '8', '9'} ;
    private char[] pullForComplexPassword = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
            'o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D',
            'E','F','G','H','I','J','K','L','M','N', 'O','P','Q','R','S','T','U',
            'V','W','X','Y','Z','0','1', '2', '3', '4', '5', '6', '7', '8', '9', '!', '@', '#',
            '$', '%', '^', '&', '*'} ;

    public char[] simplePasswordGenerator(int length) {
        Random r = new Random();
        smallPassword = new char[length];
        for (int i = 0; i < length; i++) {
            char c = pullForSimplePassword[r.nextInt(pullForSimplePassword.length)];
            smallPassword[i] = c;
        }
        System.out.println(toString(smallPassword));
        return smallPassword;
    }

    public char[] mediumPasswordGenerator(int length) {
        Random r = new Random();
        smallPassword = new char[length];
        prefix = new char[3];
        for (int i = 0; i < length; i++) {
            char c = pullForSimplePassword[r.nextInt(pullForSimplePassword.length)];
            smallPassword[i] = c;
        }
        for (int i = 0; i < 3; i++){
            char c2 = pullForSimplePassword[r.nextInt(pullForSimplePassword.length)];
            prefix[i] = c2;
        }
        System.out.println(toString(prefix) + "_" +toString(smallPassword));
        return smallPassword;
    }

    public char[] complexPasswordGenerator(int length) {
        Random r = new Random();
        complexPassword = new char[length];
        prefix = new char[3];
        for (int i = 0; i < length; i++) {
            char c = pullForComplexPassword[r.nextInt(pullForComplexPassword.length)];
            complexPassword[i] = c;
        }for (int i = 0; i < 3; i++){
            char c2 = pullForSimplePassword[r.nextInt(pullForSimplePassword.length)];
            prefix[i] = c2;
        }
        System.out.println(toString(prefix) + "_" +toString(complexPassword));
        return complexPassword;
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
