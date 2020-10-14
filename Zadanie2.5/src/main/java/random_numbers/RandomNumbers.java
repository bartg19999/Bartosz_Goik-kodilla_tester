package random_numbers;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();

        int randomNumber = random.nextInt(31);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        while (sum <= 5000) {
            int n1 = random.nextInt(31);
            sum = sum + n1;
            System.out.println(sum);
            if (n1 > max) {
                max = n1;
            }
            if (n1 < min) {
                min = n1;
            }
        }
        System.out.println("Minimum - " + min);
        System.out.println("Maxiumum - " + max);
    }
}
