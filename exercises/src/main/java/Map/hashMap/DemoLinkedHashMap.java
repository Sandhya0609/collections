package Map.hashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class DemoLinkedHashMap {
    public static void main(String[] args) {
        Map<Integer,Integer> myData=new LinkedHashMap<Integer,Integer>();
      myData.put(34,45);
      myData.put(null,67);
      myData.put(56,null);
      myData.put(32,null);
      myData.put(34,40);

      //accepts null as a key and values
        //duplicate key override eby next key with same key value
        //linked---so maintains insertion order
        //not ordered

        Iterator iterator=myData.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());


        }


    }
}
