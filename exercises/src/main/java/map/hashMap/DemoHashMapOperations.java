package map.hashMap;

import java.util.*;
//Basic Hashmap Operations:
//
//        Implement a function to insert key-value pairs into a Hashmap.
//        Implement a function to retrieve the value associated with a given key from a Hashmap.
//        Implement a function to remove a key-value pair from a Hashmap.

public class DemoHashMapOperations {
    public static void main(String[] args) {
        DemoHashMapOperations ops = new DemoHashMapOperations();
        Map<Integer, Integer> myData = new HashMap<Integer, Integer>();
        ops.insert(1, 100, myData);
        ops.insert(5, 89, myData);
        ops.insert(4, 76, myData);
//        Iterator iterator=myData.entrySet().iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());

        //insert values
        System.out.println("key-value pairs in Map after insertion are:"+myData);

        //retrieve the value
        System.out.println("The Value of the given key is:"+ops.get(1,myData));


        //remove the key-value pair
        ops.remove(5, 89, myData);
        System.out.println("After removing key-value pair:"+myData);



    }

    public void insert(Integer key, Integer value, Map map) {
        map.put(key, value);
    }


    public Integer get(Integer key, Map map) {
        return (Integer) map.get(key);
    }


    public void remove(Integer key,Integer value,Map map) {
        map.remove(key,value);
    }

}

