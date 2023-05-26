package map.weakHashMapExs;
//Create a WeakHashMap and a TreeMap object.
//        Add a few elements to both data structures.
//        Perform operations such as adding, removing, and retrieving elements from both data structures.
//        Print the contents of both data structures after each operation.
//        Observe and analyze the behavior and differences between WeakHashMap and TreeMap.


import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class CompareMaps {
    public static void main(String[] args) {
        Map<String,Integer> weakHashMap=new WeakHashMap<String,Integer>();
        Map<String,Integer> treeMap=new TreeMap<String,Integer>();

        //adding key-values
        weakHashMap.put("James",65);
        weakHashMap.put("Robert",86);
        weakHashMap.put("Andy",45);
        weakHashMap.put(null,76);

        System.out.println("Weak Hash Map:null accepted,neither sorted not ordered:");

            Iterator i=weakHashMap.entrySet().iterator();
            while (i.hasNext()){
                System.out.println(i.next());
            }
        System.out.println("          ");

        //removing entries
        System.out.println("key value pair removed:"+weakHashMap.remove("James",65));

        System.out.println("          ");

        System.out.println("After removing the map contains:");
        Iterator iterator=weakHashMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("          ");

        //retrieving elements
        System.out.println("The value of  Andy is :  "+weakHashMap.get("Andy"));

        //inserting key value pairs to treemap
        treeMap.put("Ram",67);
        treeMap.put("Laxman",64);
        treeMap.put("Gopi",98);


        System.out.println("          ");
        System.out.println("Tree Map: Ascending ordered,no null values:");
        Iterator i1=treeMap.entrySet().iterator();
        while (i1.hasNext()){
            System.out.println(i1.next());
        }

        System.out.println("          ");
        System.out.println("Remove key value pair:"+treeMap.remove("Ram",67));
        System.out.println("          ");
        System.out.println("After removing Ram value:: ");


        Iterator i2=treeMap.entrySet().iterator();
        while (i2.hasNext()){
            System.out.println(i2.next());
        }

    }
}
