package math_class;

/**
 * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Math.html
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //using math class which is a static class
        //static things (methods and variables) belong to the class rather than
        //objects (instance of the class)
        //we don't need to create an object since Math class is static
        // ClassName.methodName(); e.g. Math.random()
        // ClassName.staticVariableName(); e.g. Math.PI

        double myPI = Math.PI;

        // abs
        int num1 = -2;
        int absValue = Math.abs(num1);//If you want whole number you have to cast is as an integer
        //System.out.println(Math.abs(num1));
        // pow
        double num2 = Math.pow(3, 5);
        //System.out.println(num2);
        // sqrt
        double num3 = Math.sqrt(80);
        //System.out.println(num3);
        //System.out.println(Math.pow(num3,2));


        //create a random number in the range [0,1)
        double random1 = Math.random();
        //System.out.println(random1);
        //create a random number in the range [0, n)
        //example: [0, 6)
        double random2 = Math.random();
        // create a random number in the range [0,n]

        // create a random number in the range [m,n]



        //using the Random Class
        //This is not static so we have to create a Random object

        //create a Random object
        //For Homework (you can make up m and n values)
        Random random3 = new Random();
        // 1) create a random integer in the range [m,n]
        int randomint1 = random3.nextInt(10 - 5 + 1)+5;
        System.out.println(randomint1);
        // 2) create a random negative integer in the range [-m,0]
        int randomint2 = random3.nextInt(0 - (-7) + 1) + (-7);
        System.out.println(randomint2);
        // 3) create a random negative integer in the range [-m,-n]
        int randomint3 = random3.nextInt(-6 - (-12) + 1) + (-12);
        System.out.println(randomint3);
        // 4) create a random negative integer in the range [-m,n]
        int randomint4 = random3.nextInt(9 - (-9) + 1) + (-9);
        System.out.println(randomint4);
        //get int with and without bound

        // get double





    }
}
