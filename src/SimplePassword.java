import java.io.IOException;
import java.util.Random;

/**
 * Created by Sergey on 11.01.2016.
 */
public class SimplePassword {

    private char[] smallPassword;

    public char[] simplePasswordGenerator(int length) throws IOException {
        Random r = new Random();
        smallPassword = new char[length];
        for (int i = 0; i < length; i++) {
            char c = Storage.PULL_FOR_SIMPLE_PASSWORD[r.nextInt(Storage.PULL_FOR_SIMPLE_PASSWORD.length)];
            smallPassword[i] = c;
        }
        System.out.println(Storage.toString(smallPassword));
        return smallPassword;
    }
}
