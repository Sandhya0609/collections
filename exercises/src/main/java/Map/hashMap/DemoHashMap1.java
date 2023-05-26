package Map.hashMap;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap1 {
    public static void main(String[] args) {
        Map<String,Integer> myData=new HashMap<String,Integer>();

        //Create some keys
        String key1=new String("John");
        Integer value1= 56;
        String key2=new String("Adam");
        Integer value2= 90;
        String key3=new String("Sam");
        Integer value3= 78;

        //put the key values in map
        myData.put(key1,value1);
        myData.put(key2,value2);
        myData.put(key3,value3);
        System.out.println("MyData conatins :"+myData);

        //check the map's contents
        System.out.println("Map Size is:"+myData.size());
        System.out.println("Value of key1: "+myData.get(key1));//output: key1:value1
        //System.out.println("Remove value:"+myData.remove(key3,value3));
       // System.out.println("After removing key3:"+myData);

        //making reference null
        key1=null;

        //perform garbage collection method
        System.gc();
        System.out.println("WeakHashMap after the garbage collection:"+myData);


    }
}

