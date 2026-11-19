public class PrimeNumbers {
    public static void main(String[] args) {
        for (int number = 0; number <= 500; number++) {
            boolean isPrime = number >= 2;

            for (int divisor = 2; divisor * divisor <= number; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number);
            }
        }
    }
}