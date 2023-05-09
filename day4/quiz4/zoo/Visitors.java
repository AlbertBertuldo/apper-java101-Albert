package zoo;

public class Visitors {

    public String name;
    private int age;


    //Constructor for age variable
    public Visitors(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //age can bet retrieved by the below get method
    public int getAge() {
        return age;
    }
}
