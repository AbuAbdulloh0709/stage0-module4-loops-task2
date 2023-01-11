package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number = 2;
        while (number <= printToInclusive) {
            int i = 2, count = 0;
            while (i <= number / 2) {
                if (number % i == 0) {
                    count++;
                    break;
                }
                i++;
            }
            if (count == 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}
