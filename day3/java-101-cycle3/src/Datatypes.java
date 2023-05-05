public class Datatypes {

    static int age;
    static double salary;
    static boolean isHappy;

    static char favoriteLetter;
    static float weight;
    static long height;
    static byte grades;

    static Integer w_age;

    static Boolean w_isHappy;
    static String w_name;

    public static void main(String[] args) {
        //Zero value
        System.out.println(age); //output to zero
        System.out.println(salary); //default is 0.0
        System.out.println(isHappy); // default is false for boolean
        System.out.println(favoriteLetter); // default is default ASCII
        System.out.println(weight); // default is 0.0
        System.out.println(height);// default 0
        System.out.println(grades); // default 0

        // Wrapper
        System.out.println(w_age); // default value for wrapper is null
        System.out.println(w_isHappy);// default value for wrapper is null
        System.out.println(w_name); //default value for wrapper is null, even though it is a string
//
//        pass by value = non primiticve, wrapper
        displayAgeInAFancyWay(age);



//        pass by reference = list,array,sets

        Integer[] ages = new Integer[]{100};
        System.out.println(ages[0]);
        displayFirstElement(ages);

        //Changing non int to wrapper
        Integer newage = age;  // age variable will be a wrapper


        System.out.println("=============================================");
        int a = 9,b = 10, c = 78;
        System.out.println((a + b) * c % 4); // modulo same level with division/multiplicaiton

        System.out.println(c++ + " " + ++c);
        System.out.println(c);

    }

    public static void displayFirstElement(Integer[] a){
        System.out.println(a[0]);

    }

    public static void displayAgeInAFancyWay(Integer a){
        System.out.println("Fancy: " + "a");

    }
}
