package zoo;

import zoo.persons.managers;

public class zooApp {
    public static void main(String[] args) {
        //Instantiate manager 1 object
        managers manager1 = new managers("Manager 1");
        manager1.setName("Albert");
        manager1.setAge(24);

        System.out.println(manager1.getName());
    }
}