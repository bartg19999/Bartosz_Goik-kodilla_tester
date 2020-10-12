package random_numbers;

import java.util.Random;



public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();

        int randomNumber = random.nextInt(31);

        int min;
        int max = 0;
        int sum = 0;

        while (sum <= 5000){
            int n1 = random.nextInt(31);
            sum = sum + n1;
            System.out.println(sum);
            if (sum < 30){
                    System.out.println(sum + " - minimum");
            }else if (sum > 5000){
                    System.out.println(sum + " - maximum");
                }
            }
        }
    }
