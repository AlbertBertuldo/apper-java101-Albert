package oop.app.blueprint;

public class Person {
   public int age;
    public String name;
    public double weight;
    public String contactNumber;
    public String email;
    public boolean hasSiblings;
    public String ethnicity;
    public boolean isMale;
    public String relationshipStatus;
    public String citizenship;
    public String getNameWithPrefix(){
        String prefix = "MR. ";

        if(!isMale){
            if(relationshipStatus.equals("single")){
                prefix="MS. ";
            }
            else{
                prefix = "MRS. ";
            }
        }
        return prefix + name;
    }

    public void getJob(){
        System.out.println("Get a job!");
    }

}
