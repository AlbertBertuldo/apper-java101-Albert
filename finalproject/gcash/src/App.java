import java.util.Scanner;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        HashMap<String, UserInfo> accounts = new HashMap<String, UserInfo>();

        accounts.put("09175861661", new UserInfo("Bob", 100.0));
        accounts.put("09175861662", new UserInfo("Marley", 100.0));
        accounts.put("09175861663", new UserInfo("Seth", 100.0));
        accounts.put("09175861664", new UserInfo("Ryan", 100.0));
        accounts.put("09175861665", new UserInfo("Fritz", 100.0));

        for (HashMap.Entry<String, UserInfo> entry : accounts.entrySet()) {
            System.out.println(entry.getKey()+" | "+entry.getValue().getName()+" | "+entry.getValue().getCurrentBalance());
        }

    }

}


