package day01_Generics.number_predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PredicateRunner {

    public static void main(String[] args) {

        List<Integer> nums= new ArrayList<>(Arrays.asList(4,2,6,3,34,2,4,1,5,2,7));

        mathFun(nums,new OddPredicate<>());

        System.out.println(".............");
        mathFun(nums,new EvenPredicate<>());

    }

    public static void mathFun(List<Integer> list,NumberPredicate<Integer> numberPredicate){
        for(int each: list){
            if(numberPredicate.test(each)){
                System.out.println(each);
            }
        }
    }
}
