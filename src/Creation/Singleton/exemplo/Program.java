package Creation.Singleton.exemplo;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class Program {
    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        User user1 = new User("Gabriel", "gabriel@gmail.com", "gabriel123");
        user1.login("gabriel@gmail.com", "gabriel123");
        User user2 = new User("Joao", "gabriel@gmail.com", "gabriel123");
        user1.login("gabriel@gmail.com", "gabriel123");
        User user3 = new User("Maria", "gabriel@gmail.com", "gabriel123");
        user1.login("gabriel@gmail.com", "gabriel123");
        System.out.println(Log.showUsers());
    }
}
