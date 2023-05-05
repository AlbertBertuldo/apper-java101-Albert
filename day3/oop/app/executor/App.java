package oop.app.executor;

import oop.app.blueprint.Person;

public class App {
    public static void main(String[] args) {

        Person Albert = new Person();
        Albert.name = "Albert Bertuldo";
        Albert.age = 23;
        Albert.isMale = true;
        Albert.relationshipStatus = "Single";
        Albert.citizenship = "Pinoy";

        System.out.println(Albert.getNameWithPrefix());
        Albert.getJob();

    }
}
