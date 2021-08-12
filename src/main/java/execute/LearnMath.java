package execute;

import java.util.Random;

public class LearnMath {
    public void learnRandom() {
        Random rand = new Random();

        // Generate random integers in range from 0 to 999
        int rand_value1 = rand.nextInt(1000);
        int rand_value2 = rand.nextInt(1000);

        System.out.println("Random Numbers: " + rand_value1);
        System.out.println("Random Numbers: " + rand_value2);

        // Generate random Floats with decimals (up to seven digits)
        float rand_float1 = rand.nextFloat();
        float rand_float2 = rand.nextFloat();

        System.out.println("Random Floats: " + rand_float1);
        System.out.println("Random Floats: " + rand_float2);  //Lecture 1:23:00


        // Generate random doubles with decimals (up to sixteen digits)
        double rand_double1 = rand.nextDouble();
        double rand_double2 = rand.nextDouble();

        System.out.println("Random Doubles: " + rand_double1);
        System.out.println("Random Doubles: " + rand_double2);
    }


    public void learnRound() {
        float num1 = 74.456f;  // Must add 'f' after the decimal
        System.out.println(Math.round(num1));

        double num2 = 74.456;  // No need to add 'f' after decimal
        System.out.println(Math.round(num2));

        double num3 = 74.5123956478563541;  // No need to add 'f' after decimal
        System.out.println(Math.round(num3));

    }
        // Find out the Maximum value in between two values
    public void learnMax() {            // It can be only two values
        System.out.println(Math.max(4,6));
    }
        // Find out the Minimum Value in between two values
    public void learnMin() {         // Can be possible in between two values
        System.out.println(Math.min(4,6));

    }
}

