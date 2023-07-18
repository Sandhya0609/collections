package map.hashMap;

import java.util.Arrays;
import java.util.List;

public class NumberStartsWithOne {
    public static void main(String args[]){
        List<Integer> numbers= Arrays.asList(45,12,23,14,15,19);
        numbers.stream()
                .map(s -> s+"")
                .filter(n-> n.startsWith("1"))
                .forEach(System.out::println);

    }
}
