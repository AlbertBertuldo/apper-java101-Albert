import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int num) {
        if (num <= 1) {
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

        System.out.println("Welcome!\nPlease enter a number:");

        Scanner Scan = new Scanner (System.in);
        int number = Scan.nextInt();
        boolean result = isPrime(number);
	System.out.println("Is "+number+" a prime number? " + result);

    }
}