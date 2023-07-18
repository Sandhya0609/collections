package map.hashMap;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
    public static void main(String args[]){

        List<Integer> evenNumbers= Arrays.asList(2,3,4,5,6,7,8);
        evenNumbers.stream()
                .filter(n -> n%2==0)
                .forEach(System.out::println);
    }
}
