import java.io.IOException;
import java.util.Random;

/**
 * Created by Sergey on 11.01.2016.
 */
public class MediumPassword {

    private char[] smallPassword;
    private char[] prefix;

    public char[] mediumPasswordGenerator(int length) throws IOException {
        Random r = new Random();
        smallPassword = new char[length];
        prefix = new char[3];
        for (int i = 0; i < length; i++) {
            char c = Storage.PULL_FOR_SIMPLE_PASSWORD[r.nextInt(Storage.PULL_FOR_SIMPLE_PASSWORD.length)];
            smallPassword[i] = c;
        }
        for (int i = 0; i < 3; i++) {
            char c2 = Storage.PULL_FOR_SIMPLE_PASSWORD[r.nextInt(Storage.PULL_FOR_SIMPLE_PASSWORD.length)];
            prefix[i] = c2;
        }
        System.out.println(Storage.toString(prefix) + "_" + Storage.toString(smallPassword));
        return smallPassword;
    }
}
