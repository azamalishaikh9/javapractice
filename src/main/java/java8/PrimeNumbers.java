package java8;

public class PrimeNumbers {

    public static void main(String[] args) {
        int i = 100;
        System.out.println("Prime numbers in " + i + " are: ");
        for (int j = 2; j <= i; j++) {
            if (isPrime(j)) {
                System.out.print(j + " ");
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
