package zoo;

public class Employees {

    public String name;

    // protected - Visible only to Managers
    protected int salary;
    public Animals assignedAnimal;

    public Employees(String name, int salary) {
        this.name = name;
        salary = salary;
    }

    public void feedAnimal() {
        assignedAnimal.chewFood();
    }

    public void setAssignedAnimal(Animals animal) {
        assignedAnimal = animal;
    }


}
