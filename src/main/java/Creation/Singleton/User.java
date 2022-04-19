package Creation.Singleton;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

public class User {
    private String password;
    private String nome;
    private String email;
    private Log log;


    public User(String nome, String email, String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        this.nome = nome;
        this.email = email;
        this.password = Encryption.encryptPassword(password);
        log = Log.startLoggin();
    }

    public void login(String email, String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        if (email == null && password == null) {
            System.out.println("Email ou senha invalidos!");
        }
        if (Objects.equals(email, this.email) && Objects.equals(this.password, Encryption.encryptPassword(password))) {
            System.out.println(this.nome +" - Login!!");
            log.userLogged(this);
        }
        else{
            System.out.println(this.nome + " - Senha incorreta!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
