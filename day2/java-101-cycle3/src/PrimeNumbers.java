import java.util.Scanner;

public class PrimeNumbers {


    public static void main(String[] args) {
        //Input range: 1 - 10_000_000
        System.out.println(isPrimeNumber(6));

    }
    public static boolean isPrimeNumber(int num){
        long startTime = System.nanoTime();

        for (int count = 2; count <num; ++count) {
            if (num % count == 0) {
                return false;
            }
        }

        long endTime = System.nanoTime();
        System.out.println("Duration: " + (endTime - startTime));
        return true;
    }



}
