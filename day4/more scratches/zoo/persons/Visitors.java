package zoo.persons;


//Extends means it will inherit methods and variable from parent class
public class Visitors extends Human {
    public int getAge() {
        //super means it will try to call the constructor of parent class?
        return super.getAge();
    }
}
