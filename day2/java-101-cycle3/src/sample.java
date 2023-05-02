public class sample {
    public static void main(String[] args) {
        int num = 1;
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
