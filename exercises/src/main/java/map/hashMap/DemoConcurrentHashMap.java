package map.hashMap;
//Implement a concurrent Hashmap that supports thread-safe operations.
//        Explore and understand the internal implementation of Hashmaps in your programming language of choice.
//        Research and implement optimizations for Hashmaps (e.g., open addressing with cuckoo hashing, Robin Hood hashing)

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DemoConcurrentHashMap {
    public static void main(String[] args) {
        Map<String,Integer> myData=new ConcurrentHashMap<String,Integer>();

        System.out.println("Empty map:"+myData);

        myData.put("Java",100);
        myData.put("C++",50);

        System.out.println("After entry was added:"+myData);

        //retrieve a value for a particular key
        System.out.println("Value of Java entry: "+myData.get("Java"));

        //replace value
        System.out.println("Replace value of Java:"+myData.replace("Java",100,200));
        System.out.println(myData);

        //only keyset
        System.out.println("Key values only:"+myData.keySet());

    }
}
