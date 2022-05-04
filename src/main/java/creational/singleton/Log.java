package creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class Log {
    static private Log instance = null;
    static private List<String> loggedUsers;
    static private Integer totalUsers = 0;

    private Log(){
        loggedUsers = new ArrayList<>();
    }

    static Log startLoggin(){
        if (instance == null)
            instance = new Log();
        return instance;
    }

    public void userLogged(String email){
        loggedUsers.add(email);
        totalUsers++;
    }

    static public String showUsers(){
        StringBuilder sb = new StringBuilder();
        sb.append("++++++ LOGGED USERS ++++++\n");
        for (String u: loggedUsers){
            sb.append(u).append("\n");
        }
        sb.append(" TotalUsers: ").append(totalUsers);
        return sb.toString();
    }


}
