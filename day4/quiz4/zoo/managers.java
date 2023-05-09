package zoo;

public class managers extends Employees {
    public int age;
    public String initialTitle;

    public managers (String name, int salary, int age, String initialTitle) {
        super(name, salary);
        this.age = age;
        this. initialTitle = initialTitle;
    }

    // Method to access salary variable
    public int getSalary() {
        return salary;
    }
}
