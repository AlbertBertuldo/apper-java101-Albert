import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> cars= new HashMap<>();
        cars.put("c1","Innova");
        cars.put("c2","Honda");
        cars.put("c3","Montero");
        cars.put("c4","Vios");
        cars.put("c5","Mitsubishi");
        cars.put("c6","Tesla");

        System.out.println(cars.get("c4"));
        System.out.println(cars.size());
        System.out.println(cars.keySet());
        System.out.println(cars.containsKey("c7"));
        System.out.println(cars.containsValue("Montero"));
    }
}
