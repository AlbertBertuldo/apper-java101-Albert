package zoo;

import zoo.persons.managers;

public class zooApp {
    public static void main(String[] args) {
        managers manager1 = new managers("Manager 1");
        manager1.setName("Orvyl");
        manager1.setAge(12);

        System.out.println(manager1.getName());
    }
}