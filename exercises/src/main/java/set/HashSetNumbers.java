package set;//Create a HashSet and perform the following operations:
//
//        Add the numbers 1, 2, 3, 4, 5 to the HashSet.
//        Check if the HashSet contains the number 3.
//        Remove the number 4 from the HashSet.
//        Print the size of the HashSet.
//        Clear the HashSet.


import java.util.HashSet;
import java.util.Set;

public class HashSetNumbers {
    public static void main(String[] args) {
        Set<Integer> myData=new HashSet<Integer>();
        //Add the numbers 1, 2, 3, 4, 5 to the HashSet.
        myData.add(1);
        myData.add(2);
        myData.add(3);
        myData.add(4);
        myData.add(5);

       // Check if the HashSet contains the number 3.
        System.out.println("HashSet contains Number 3: "+myData.contains(3));

       // Remove the number 4 from the HashSet.
        System.out.println(" Remove number 4:"+myData.remove(4));
        //Print the size of the HashSet.
        System.out.println("Hashset Size: "+myData.size());

        // Clear the HashSet by using .clear()  method
        myData.clear();

        System.out.println("Hashset is empty:"+myData);




    }
}
