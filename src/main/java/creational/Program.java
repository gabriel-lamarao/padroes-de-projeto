package creational;

import creational.singleton.Log;
import creational.singleton.User;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

    private static void esperePontos(String mensagem) throws InterruptedException {
        System.out.print(mensagem);
        for (int i = 0; i < 3; i++) {
            Thread.sleep(800);
            System.out.print(".");
        }
    }

    public static void main(String[] args) {
        try {
            LoggerFactory.getLogger(Program.class);
            List<String> usuarios = new ArrayList<>(Arrays.asList("Joao", "Maria", "Gabriel"));

            System.out.println("Cadastrando usuarios");

            esperePontos("Cadastrando " + usuarios.get(0));
            System.out.println();
            User user1 = new User("Joao", "joao@gmail.com", "joao123", "pc");
            esperePontos("Logando " + usuarios.get(0));
            System.out.println();
            user1.login("joao@gmail.com", "joao123");

            esperePontos("Cadastrando " + usuarios.get(1));
            System.out.println();
            User user2 = new User("Maria", "maria@gmail.com", "maria123", "mobile");
            esperePontos("Logando " + usuarios.get(1));
            System.out.println();
            user2.login("maria@gmail.com", "maria123");

            esperePontos("Cadastrando " + usuarios.get(2));
            System.out.println();
            User user3 = new User("Gabriel", "gabriel@gmail.com", "gabriel123", "pc");
            esperePontos("Logando " + usuarios.get(2));
            System.out.println();
            user3.login("gabriel@gmail.com", "gabriel123");

            System.out.println();
            System.out.println(Log.showUsers());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
