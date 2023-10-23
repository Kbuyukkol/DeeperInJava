package AdvancedJava.day01.number_predicate;

public class EvenPredicate <T> implements NumberPredicate<T>{

    @Override
    public boolean test(T t) {
        return (Integer)t %2==0;
    }
}
