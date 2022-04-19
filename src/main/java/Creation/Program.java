package Creation;

import Creation.Bridge.Platform;
import Creation.Singleton.Log;
import Creation.Singleton.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class Program {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        Logger logger = LoggerFactory.getLogger(Program.class);
        String nome = "Joao";
        String email = "joao@gmail.com";
        String password = "joao123";

        User user1 = new User(nome, email, password);
        User user2 = new User("Maria", "maria@gmail.com", "maria123");
        Platform pt = new Platform() {
            @Override
            public void generateReport() throws IOException {
                super.generateReport();
            }
        };

        user1.login(email, password);
        user2.login("maria@gmail.com", "maria12");
        pt.generateReport();
        System.out.println(Log.showUsers());

    }
}
