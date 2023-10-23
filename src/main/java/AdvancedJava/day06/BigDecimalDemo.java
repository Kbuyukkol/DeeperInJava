package AdvancedJava.day06;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {

    public static void main(String[] args) {

        double d = 10.99;
        double d2 = 2.55;
        System.out.println(d - d2);

        BigDecimal d3 = new BigDecimal("10.99");
        BigDecimal d4 = new BigDecimal("2.55");
        System.out.println(d3.subtract(d4));

        BigDecimal d5 = new BigDecimal("23.1251");
        System.out.println(d5.setScale(1, RoundingMode.CEILING));
        System.out.println(d5.setScale(1, RoundingMode.FLOOR));
        System.out.println(d5.setScale(2, RoundingMode.CEILING));
        System.out.println(d5.setScale(2, RoundingMode.FLOOR));
        System.out.println(d5.setScale(3, RoundingMode.CEILING));
        System.out.println(d5.setScale(3, RoundingMode.FLOOR));

        System.out.println(d5.subtract(new BigDecimal("1.1")));


    }
}