package creation.singleton;

import creation.bridge.Mobile;
import creation.bridge.Pc;
import libs.Util;
import structural.adapter.EmailValidatorAdaptee;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class User {
    private final Log log;
    private String email;
    private String name;
    private String password;
    private String platform;
    private List<User> users;


    public User(String name, String email, String password, String platform) throws IOException, NoSuchAlgorithmException {
        setEmail(email);
        setName(name);
        setPassword(password);
        setPlatform(platform);
        signIn();
        log = Log.startLoggin();
    }

    private void signIn() {
        if (users == null) users = new ArrayList<>();
        users.add(this);
    }

    public void login(String email, String password) throws NoSuchAlgorithmException {
        if (email == null && password == null) {
            System.out.println("Email ou senha invalidos!");
        }
        for (User user : users) {
            if (user.email.equals(email) && user.password.equals(Encryption.encryptPassword(password))) {
                System.out.println(email + " Login realizado!");
                log.userLogged("Email: " + user.getEmail() + " Platform: " + user.getPlatform());
            } else {
                System.out.println(email + " Email ou senha incorreta!");
            }
        }
    }


    private String getPlatform() {
        return platform;
    }

    private void setPlatform(String platform) throws IOException {
        switch (Util.getPlatform(platform)) {
            case PC -> {
                Pc pc = new Pc();
                this.platform = pc.generateReport();
            }
            case MOBILE -> {
                Mobile mobile = new Mobile();
                this.platform = mobile.generateReport();
            }
        }
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        EmailValidatorAdaptee emailValidator = new EmailValidatorAdaptee();
        try {
            if (emailValidator.validEmail(email)) {
                this.email = email;
                System.out.println(email + " Email Válido!");
            } else {
                throw new RuntimeException("Email Invalido");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private String getPassword() {
        return password;
    }

    private void setPassword(String password) throws NoSuchAlgorithmException {
        this.password = Encryption.encryptPassword(password);
    }
}
