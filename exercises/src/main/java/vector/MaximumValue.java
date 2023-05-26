package vector;

import java.sql.Array;
import java.util.*;

//Find Maximum Value
//Write a method that takes an ArrayList of integers as input and
// returns the maximum value in the list.
public class MaximumValue {
    public static void main(String[] args) {
        //Adding integers as input
        List<Integer> list= new ArrayList<Integer>(Arrays.asList(34,45,67,32,98,100));

         int maxValue=list.get(0);

         for(int i=0;i<list.size();i++){
             if(maxValue<list.get(i)){
                 maxValue=list.get(i);
             }
         }
        System.out.println("The maximum value in the given arraylist is: "+maxValue);

//        'max' method is used to find the maximum element from Collections Class

        int maxValue1 =     Collections.max(list);
        System.out.println("The maximum value in the given arraylist is:"+maxValue1);




    }
}
