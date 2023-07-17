package list;
//Develop a java class with a method saveEvenNumbers(int N) using ArrayList to store even
// numbers from 2 to N, where N is a integer which is passed as a parameter to the method
// saveEvenNumbers().
//The method should return the ArrayList (A1) created.
// In the same class create a method printEvenNumbers()which iterates through
// the arrayList A1 in step 1, and It should multiply each number with 2 and display it
// in format 4,8,12....2*N. and add these numbers in a new ArrayList (A2).
// The new ArrayList (A2) created needs to be returned.
// Create a method printEvenNumber(int N) parameter is a number N.
// This method should search the arrayList (A1)
// for the existence of the number ‘N’ passed. If exists it should return the Number
// else return zero.Hint: Use instance variable for
// storing the ArrayList A1 and A2. NOTE: You can test the methods using a main method.

import java.util.ArrayList;
import java.util.List;

class DemoList1 {
  List<Integer> list1=new ArrayList<Integer>();
  private ArrayList<Integer> saveEvenNumbers(int n) {
      list1 = new ArrayList<Integer>();
      for (int i = 2; i <= n; i++) {
          if (i % 2 == 0)
              list1.add(i);}
      System.out.println("Even numbers:"+list1);
          return (ArrayList<Integer>) list1;
      }
   private ArrayList<Integer> printEvenNumbers(){
      List<Integer> list2=new ArrayList<Integer>();
      for(int item : list1){
          list2.add(item*2);
      }
       System.out.println("Factors:"+list2);

       return (ArrayList<Integer>) list2;
   }

   public int isNumberPresent(int n) {

      if(list1.contains(n)){
          System.out.println(n + " is present in list");
          return n;
      }else{
          return 0;

      }

   }

    public static void main(String[] args) {
        DemoList1 list = new DemoList1();
        list.saveEvenNumbers(4);
        list.printEvenNumbers();
        System.out.println("number is not present: "+list.isNumberPresent(1));
    ;
    }

  }

