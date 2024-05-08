import java.util.HashSet;
import java.util.Set;

// duplicate element not allowed and order define because hashing is working in this method check duplicate element
public class Hash_Set_collection {
    public static void main(String[] args) {
        Set<Integer> set =new HashSet<>();
        set.add(34);
        set.add(5);
        set.add(56);
        set.add(22);
        set.add(66);
        System.out.println(set);

        set.remove(66);
        System.out.println(set);
        System.out.println(set.contains(100)); // return boolean value true amd false

        System.out.println(set.isEmpty()); // return boolean value true amd false
        System.out.println(set.size());
        set.clear();
        System.out.println(set);



    }
}
