package DemoQueue;

import java.util.Iterator;
import java.util.Queue;
import java.util.PriorityQueue;

public class DemoPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> myData=new PriorityQueue<Integer>();
        myData.add(8);
        myData.add(90);
        myData.add(3);
        myData.add(3);
        //allows duplicate values
        //neither sorted nor ordered
       // myData.add(null); no null values
        System.out.println("displays head of the element but not removes:"+myData.peek());
        System.out.println("dispalys head of the elemnts and removes from queue:"+myData.poll());


        Iterator iterator=myData.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
            }
        }

