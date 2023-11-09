package day09_Iterating;

import java.util.*;

public class C02_Iterator {

    public static void main(String[] args) {

        List<String> countries = Arrays.asList("Germany", "Panama", "Australia");

        Iterator<String> countriesIterator = countries.iterator();

        while(countriesIterator.hasNext()) {
            System.out.println(countriesIterator.next());
        }

        System.out.println("-------------------------------------");

        List<String> names = new ArrayList<>(Arrays.asList("Ali", "Veli", "Remzi"));

        Iterator<String> iterator = names.iterator();
        System.out.println("iterator.hasNext() = " + iterator.hasNext());//true
        System.out.println("iterator.next() = " + iterator.next()); //Ali
        System.out.println("iterator.next() = " + iterator.next()); //Veli
        System.out.println("iterator.next() = " + iterator.next()); //Remzi
        System.out.println("iterator.hasNext() = " + iterator.hasNext());// false
        //System.out.println("iterator.next() = " + iterator.next()); ----> Exception


        System.out.println("-------------------------------------");

        List<String> namesList = new ArrayList<>(Arrays.asList("Ali", "Veli", "Remzi"));

        Iterator<String> iterator2 = namesList.iterator();

        while (iterator2.hasNext()) {
            //System.out.println(iterator2.next());
            iterator2.forEachRemaining((value) -> System.out.print(value + " "));
        }

        System.out.println();
        System.out.println("-------------------------------------");

        Set<String> words = new HashSet<>(Arrays.asList("one", "two", "three", "four"));

        Iterator<String> iterator1 = words.iterator();


        while (iterator1.hasNext()) {
            if (iterator1.next().length() <= 4) {
                iterator1.remove();
            }
        }

        System.out.println("words = " + words);

        System.out.println("-------------------------------------");

        List<String> words2 = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "one", "two"));

        Iterator<String> it = words2.iterator();

        while (it.hasNext()) {
            if (it.next().equals("two")) {
                it.remove();
            }
        }
        System.out.println("words2 = " + words2);

        System.out.println("-------------------------------------");

        Map<String, Integer> workers = new HashMap<>();
        workers.put("Aygun", 95);
        workers.put("Maria", 90);

        Iterator<String> mapIterator = workers.keySet().iterator();
        Iterator<Integer> mapIterator2 = workers.values().iterator();
        while (mapIterator.hasNext()) {
            System.out.println(mapIterator.next());

        }
        while (mapIterator2.hasNext()) {
            System.out.println(mapIterator2.next());

        }



    }


}
