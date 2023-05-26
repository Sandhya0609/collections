package set;
//      Create a LinkedHashSet and perform the following operations:
//        Add the strings "apple", "banana", "cherry", "date" to the LinkedHashSet.
//        Print the elements of the LinkedHashSet.
//        Remove the string "banana" from the LinkedHashSet.
//        Add the string "elderberry" to the LinkedHashSet.
//        Print the size of the LinkedHashSet.
//        Clear the LinkedHashSet.

import java.util.LinkedHashSet;
import java.util.Set;

public class DemoLinkedHashSet
{
    public static void main(String[] args) {
        Set<String> myData=new LinkedHashSet<>();
        myData.add("Apple");
        myData.add("Banana");
        myData.add("Cherry");
        myData.add("Dates");

        //Print the elements of the LinkedHashSet.
        System.out.println("The set contains:"+myData);
        //Remove the string "banana" from the LinkedHashSet.
        System.out.println("Banana is removed: "+myData.remove("Banana"));

        //Add the string "elderberry" to the LinkedHashSet.
        myData.add("Elderberry");
        System.out.println("After adding Elderberry,the set contains: "+myData);

        //Print the size of the LinkedHashSet.
        System.out.println("The size of the Set is:"+myData.size());
        //Clear the LinkedHashSet.

        myData.clear();
        System.out.println("The set is empty:"+myData);

    }
}
