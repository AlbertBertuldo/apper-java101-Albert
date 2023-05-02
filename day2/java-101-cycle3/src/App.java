import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World");

        // Let's talk about variables
        int quantity = 9;
        int _quantity9aewhyrser = 9;

        //camel case always
        double myGrade = 89.9;

        // Except for static variables (will discuss soon)
        //double MY_GRADE = 89.8
        double myJava101Grade = 90.2;
        String myAlias = "bert";

        //numeric whole number datatypes: short, int , long
        int age = 15;
        System.out.println(age);
        age = age + 10; //results into 25
        System.out.println(age);

        long myPera = 1000;
        long newBalance = myPera + age; //NOTE: newBalance should not be int
        System.out.println(newBalance);


        //String
        allAboutString();
        allAboutDecimal(age);
        }

    public static void allAboutString(){
        /// Strings - These are non-primitive data type. Used for reference
        String myName = "Albert";
        String num = "1";  //array of characters

        System.out.println(myName);
        System.out.println(myName.toLowerCase());
        System.out.println(myName.toUpperCase());
        String completeName = myName + " Bertuldo";
        System.out.println(myName.toUpperCase());
        System.out.println(completeName);
        //Substring

        System.out.println(myName.substring(2,5));

        boolean isEqualName = myName.equals("albert");  //returns false
        boolean isEqualIgnoreCase = myName.equalsIgnoreCase("albert"); //returns true

        System.out.println(isEqualName + " " + isEqualIgnoreCase);

    }


    public static void allAboutDecimal(int age){
        //////////////////////////////////////////////////////////
        //decimal: double and float
        double price = 4.45;

        double newPrice = price +age;
        System.out.println(newPrice);  // automatic promotion to float

        float disc = 9.99f;
        double subtotal = newPrice + disc; // automatic promotion to double
        System.out.println(subtotal);

        int resultMaxValue = Integer.MAX_VALUE + Integer.MAX_VALUE;
        System.out.println(resultMaxValue);


    }



}
