import java.util.HashMap;
import java.util.Map;

// store key and value (type) , keys will uniques and override and also upgrade
public class Hash_Map_collection {
    public static void main(String[] args) {
        Map<String, Integer> mymap = new HashMap<>();
        mymap.put("one", 1);
        mymap.put("two", 2);
        mymap.put("three", 3);
        mymap.put("four", 3);
        mymap.put("five", 3);

//        if(mymap.containsKey("two")){
//            mymap.put("Two",66);
//
//        }  // you can use  putIfAbsent()

        mymap.putIfAbsent("Two", 66);

        System.out.println(mymap);
        System.out.println(mymap.containsValue(3));
        System.out.println(mymap.isEmpty());

        //Iterate key
//        for (Map.Entry<String, Integer> e : mymap.entrySet()) { // return entry set
//            System.out.println(e);
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
//
//        //Iterate value
//for (String key:mymap.keySet()){
//    System.out.println(key);
//}
//      for(Integer value:mymap.values()){
//          System.out.println(value);
//      }



    }
}
