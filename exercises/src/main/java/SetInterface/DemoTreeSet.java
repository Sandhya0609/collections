package SetInterface;

import java.sql.SQLOutput;
import java.util.Set;
import java.util.TreeSet;

//Create a TreeSet and perform the following operations:
//
//        Add the numbers 5, 10, 2, 8, 3 to the TreeSet.
//        Print the elements of the TreeSet in ascending order.
//        Find and print the smallest element in the TreeSet.
//        Find and print the largest element in the TreeSet.
//        Remove the number 8 from the TreeSet.
//        Print the size of the TreeSet.
//        Clear the TreeSet.
public class DemoTreeSet {
    public static void main(String[] args) {
        Set<Integer> myData=new TreeSet<>();
        myData.add(5);
        myData.add(10);
        myData.add(2);
        myData.add(8);
        myData.add(3);

        //Print the elements of the TreeSet in ascending order.
        System.out.println("Ascending order of th elements:" +myData);

        //Find and print the smallest and largest elements in the TreeSet.
        System.out.println("Smallest Number: "+((TreeSet<Integer>) myData).first());
        System.out.println("Largest Number: "+((TreeSet<Integer>) myData).last());

        //Remove the number 8 from the TreeSet.
        System.out.println("Remove 8 from set: "+myData.remove(8));
        System.out.println("After removing 8,set contains:"+myData);

        //Print the size of the TreeSet.
        System.out.println("Size of the set is:"+myData.size());

        //clear data
        myData.clear();
        System.out.println("Empty Set:"+myData);

    }
}
