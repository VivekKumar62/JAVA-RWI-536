import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Tree_Map_Collection {
    public static void main(String[] args) {
        // under the hood keys ko  binary search tree ke under put krta hai and short thr keys


        Map<String, Integer> treemap = new TreeMap<>();
        treemap.put("one", 1);
        treemap.put("two", 2);
        treemap.put("three", 3);
        treemap.put("four", 3);
        treemap.put("five", 3);


        System.out.println(treemap);
        System.out.println(treemap.containsValue(3));
        System.out.println(treemap.isEmpty());
        treemap.remove("three");
        System.out.println(treemap);



//        if(mymap.containsKey("two")){
//            mymap.put("Two",66);
//
//        }  // you can use  putIfAbsent()

//        mymap.putIfAbsent("Two", 66);


    }
}
