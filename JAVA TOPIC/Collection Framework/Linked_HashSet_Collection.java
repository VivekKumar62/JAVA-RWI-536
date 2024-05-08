import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_HashSet_Collection { //be go of one
    public static void main(String[] args) {
        Set<Integer> set =new LinkedHashSet<>(); // implement  linked list properties one by one (order)
        set.add(34);
        set.add(5);
        set.add(56);
        set.add(22);
        set.add(66);
        System.out.println(set);

//        set.remove(66);
//        System.out.println(set);
//        System.out.println(set.contains(100)); // return boolean value true amd false
//
//        System.out.println(set.isEmpty()); // return boolean value true amd false
//        System.out.println(set.size());
//        set.clear();
//        System.out.println(set);

    }
}
