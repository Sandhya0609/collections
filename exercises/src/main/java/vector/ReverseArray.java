package vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a method that takes an ArrayList of any type as input and reverses the order of its elements.
public class ReverseArray {
    public static void main(String[] args) {

        //Creating Arraylist object//use the Object class that can hold values of any type
      List<Object> myData = new ArrayList<Object>();

        //Adding elements to ArrayList
        myData.add("Java");
        myData.add("Is Number");
        myData.add(1);
        myData.add("Programming");
        myData.add("Language");
        System.out.println("Original Elements in an Array");
        System.out.println(myData);

        Collections.reverse(myData);//*Reversing the list using reverse()  method
        System.out.println("Reverse of the Array:");
        System.out.println(myData);



    }
}

