package Map.weakHashMapExs;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class DemoTreeMap {
    public static void main(String[] args) {
        Map<Integer,Integer> myData=new TreeMap<Integer,Integer>();//no null values,ascending order

        myData.put(34,45);
        //myData.put(null,67);
        myData.put(56,null);
        myData.put(32,null);
        myData.put(34,40);

        //no null values as a key
        //tree...ascending order sorted



        Iterator iterator=myData.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
