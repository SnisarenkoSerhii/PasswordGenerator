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
            char c = Service.PULL_FOR_SIMPLE_PASSWORD[r.nextInt(Service.PULL_FOR_SIMPLE_PASSWORD.length)];
            smallPassword[i] = c;
        }
        for (int i = 0; i < 3; i++) {
            char c2 = Service.PULL_FOR_SIMPLE_PASSWORD[r.nextInt(Service.PULL_FOR_SIMPLE_PASSWORD.length)];
            prefix[i] = c2;
        }
        System.out.println(Service.toString(prefix) + "_" + Service.toString(smallPassword));
        return smallPassword;
    }
}
