package day01_Generics.number_predicate;

public class OddPredicate <T> implements NumberPredicate<T>{
    @Override
    public boolean test(T t) {
        return (Integer)t %2==1;
    }


    }
