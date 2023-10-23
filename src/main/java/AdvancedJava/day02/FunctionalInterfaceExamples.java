package AdvancedJava.day02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.*;

public class FunctionalInterfaceExamples {

    public static void main(String[] args) {

        //Predicate : one parameter return boolean
        Predicate<Integer> lessThan10 = n -> n < 10;
        System.out.println(lessThan10.test(5));

        List<Integer> nums = new ArrayList<>(Arrays.asList(23, 5, 21, 5, 2, 2, 1, 6, 22));
        nums.removeIf(n -> n % 2 == 1);
        System.out.println(nums);

        Predicate<String> isPalindrome = s -> new StringBuilder(s).reverse().toString().equals(s);
        System.out.println(isPalindrome.test("racecar"));

        //Consumer : one parameter no return

        Consumer<String> firstChar = str -> System.out.println(str.charAt(0));
        firstChar.accept("Konya");

        List<String> names = new ArrayList<>(Arrays.asList("Kelly", "James", "Eren", "Salma"));
        names.forEach(s -> System.out.print(s + " "));
        System.out.println(".................");
        names.forEach(s -> System.out.println(s.charAt(0) + " " + s.charAt(s.length() - 1)));

        //BiConsumer : two parameters no return
        BiConsumer<Integer, Integer> sum = (n1, n2) -> System.out.println(n1+n2);
        sum.accept(5,7);

        BiConsumer<List<String>,Integer> subNames = (namesList,end)-> {
            for (String each:namesList) {
                System.out.println(each.substring(0,end));

            }
        };
        subNames.accept(names,3);

        Map<String, String> holidays = new HashMap<>();

        holidays.put("July", "4th of July");
        holidays.put("October", "Halloween");
        holidays.put("December", "Christmas");
        holidays.forEach((k,v)-> System.out.println(k+" "+v));

        //Function : one parameter return Object

        Function<String, Integer> countVowels = str-> {
            String vowels="aeiou";
            int numOfVowels= 0;
            for(char each: str.toCharArray()){
                if(vowels.contains(each+"")){
                    numOfVowels++;
                }
            }
            return numOfVowels;
        };

        System.out.println(countVowels.apply("ankara"));

        Function<int[],List<Integer>> convertToList = arr-> {
            List<Integer> list= new ArrayList<>();
            for(int each: arr ){
                list.add(each);
            }
            return list;
        };

        int[] array= {4,5,7};
        System.out.println(convertToList.apply(array));

        //Supplier : no parameter return Object

        Supplier<String> getDay = ()-> LocalDate.now().getDayOfWeek().name();

        System.out.println(getDay.get());

        Supplier<String> getTime= ()-> LocalTime.now().toString();

        System.out.println(getTime.get());

        Supplier<String> getDayTime= ()-> LocalDateTime.now().format(DateTimeFormatter.ofPattern("M/d/y h:m a"));
        System.out.println(getDayTime.get());

        Supplier<Integer> getRandomNumber = ()-> new Random().nextInt(1001);
        System.out.println(getRandomNumber.get());


    }
}
