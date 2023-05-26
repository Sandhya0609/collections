package Map.weakHashMapExs;
//Create a WeakHashMap object.
//        Create a few objects and associate them with some data in the WeakHashMap.
//        Print the size of the WeakHashMap.
//        Set the strong references to the objects to null.
//        Run the garbage collector and wait for a short time.

import java.util.Map;
import java.util.WeakHashMap;

public class DemoWeakHashMap1 {
    public static void main(String[] args) {
        Map<String,Integer> myData=new WeakHashMap<String,Integer>();
        //Create some keys
        //boxing giving those cross-marked integer lines
        String key1=new String("John");
        Integer value1=new Integer(56);
        String key2=new String("Adam");
        Integer value2=new Integer(90);
        String key3=new String("Sam");
        Integer value3=new Integer(78);

        //put the key values in map
        myData.put(key1,value1);
        myData.put(key2,value2);
        myData.put(key3,value3);
        System.out.println("MyData contains :"+myData);

        //check the map's contents
        System.out.println("Map Size is:"+myData.size());
        System.out.println("Value of key1: "+myData.get(key1));//output: key1:value1

        //making reference null
        key1=null;

        //perform garbage collection method
        System.gc();
        System.out.println("WeakHashMap after the garbage collection:"+myData);


    }
}
