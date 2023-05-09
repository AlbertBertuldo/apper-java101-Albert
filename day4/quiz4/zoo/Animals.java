package zoo;

public class Animals {
    public String name;
    public String type;
    public String food;

    //Use contructor to initialize the variable
    public Animals(String name, String type, String food) {
        this.name = name;
        this.type = type;
        this.food = food;
    }

    public void makeSound() {
        // Produces the sound of the animal
        System.out.println("This animal is barking (example for DOG)");
    }

    public void chewFood() {
        // Chews the food
        System.out.println("This animal is chewing food");
    }
}
