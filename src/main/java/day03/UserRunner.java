package day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class UserRunner {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>(Arrays.asList(
                new User("jbond7", "007"),
                new User("javaLover", "java"),
                new User("sdetFan", "testing"),
                new User("programmingIsFun", "java")
        ));

        users.forEach(user -> System.out.println(user)); // as a lambda
        users.forEach(System.out::println); // as a method reference

        users.removeIf(p -> p.getPassword().equals("java"));
        System.out.println("After removing");
        users.forEach(System.out::println);

        BiFunction<String, String, User> createUser = (user, pass) -> new User(user, pass);
        User newUser = createUser.apply("catsAreTheBest", "noDogs");

        BiFunction<String, String, User> createUser2 = User::new;
        User newUser2 = createUser2.apply("dogsAreBetter", "noCats");







    }
}
