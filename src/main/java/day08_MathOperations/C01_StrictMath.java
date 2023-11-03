package day08_MathOperations;

public class C01_StrictMath {

    public static void main(String[] args) {

        double val1 = 16, val2 = 125, val3 = -7;

        //square root
        System.out.println(StrictMath.sqrt(val1));

        //cube root
        System.out.println(StrictMath.cbrt(val2));

        //absolute value
        System.out.println(StrictMath.abs(val3));

        //hypotenuse
        System.out.println("StrictMath.hypot(3,4) = " + StrictMath.hypot(3, 4));

        //power
        System.out.println("StrictMath.pow(3,4) = " + StrictMath.pow(3, 4));//81.0


        System.out.println("Math.sqrt(-10) = " + Math.sqrt(-10));
        System.out.println("StrictMath.sqrt(-10) = " + StrictMath.sqrt(-10));

        double num =2;
        double sqrtNum = Math.sqrt(num);
        System.out.println("Math.pow(sqrtNum,2) = " + Math.pow(sqrtNum, 2));
        sqrtNum= StrictMath.sqrt(num);
        System.out.println("StrictMath.pow(sqrtNum,2) = " + StrictMath.pow(sqrtNum, 2));


    }
}
