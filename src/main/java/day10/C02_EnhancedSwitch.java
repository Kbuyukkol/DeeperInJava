package day10;

public class C02_EnhancedSwitch {
/*
Enhancements to switch statements were introduced by Java 12 and then further modified by Java 13.
 */

    public static void main(String[] args) {


       int itemCode = 001;

        String text = switch (itemCode) {
            case 001 :
                yield "It's a laptop!";
            case 002 :
                yield "It's a desktop!";
            case 003 :
                yield "It's a mobile phone!";
            default :
                throw new IllegalArgumentException(itemCode + "is an unknown device!");
        };

        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003,004 -> System.out.println("It's a mobile phone!");
        }

    }
}
