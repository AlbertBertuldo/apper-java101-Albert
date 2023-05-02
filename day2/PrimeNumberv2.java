import java.util.Scanner;

public class PrimeNumberv2 {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {

        System.out.println("Welcome!\nPlease enter an integer");

        Scanner Scan = new Scanner (System.in);
        int number = Scan.nextInt();

        long startTime = System.nanoTime();
        boolean result = isPrime(number);
        long endTime = System.nanoTime();

        System.out.println("Is "+number+" a prime number? " + result);
        System.out.println("Duration: " + (endTime - startTime));

    }
}