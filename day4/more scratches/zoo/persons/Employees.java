package zoo.persons;

import zoo.Animals;

public class Employees extends Human {
    double salary;

    void feedAnimal(Animals animal) {
        animal.chewFood();
    }
}