package Creation.Singleton;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encryption {

    static String encryptPassword(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest algorithm = MessageDigest.getInstance("MD5");
        byte messageDigest[] = algorithm.digest(password.getBytes(StandardCharsets.UTF_8));
        return new String(messageDigest, StandardCharsets.UTF_8);
    }

}
