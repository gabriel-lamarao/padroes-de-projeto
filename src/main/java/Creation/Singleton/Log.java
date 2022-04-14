package Creation.Singleton;

import java.util.ArrayList;
import java.util.List;

public class Log {
    static private Log instance = null;
    static private List<User> users;
    static private Integer totalUsers = 0;

    private Log(){
        users = new ArrayList<>();
    }

    static Log startLoggin(){
        if (instance == null)
            instance = new Log();
        return instance;
    }

    public void userLogged(User user){
        users.add(user);
        totalUsers++;
    }

    static public String showUsers(){
        StringBuilder sb = new StringBuilder();
        for (User u: users){
            sb.append(u.getNome() + " ");
        }
        sb.append(" " + totalUsers);
        return sb.toString();
    }


}
