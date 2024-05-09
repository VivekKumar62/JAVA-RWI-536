import java.util.*;

public class Ascending_Descending {
    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        Collections.sort(list,(a,b)-> b-a); //use comparator
//        System.out.println(list); //[5, 4, 3, 2, 1]

        Set<Integer> s= new TreeSet<>();
        s.add(1);
        s.add(69);
        s.add(39);
        s.add(48);
        s.add(59);
        System.out.println(" before maniual sorting" +s );
        Set<Integer> ss= new TreeSet<>((a,b)-> b-a);
        ss.add(22);
        ss.add(33);
        ss.add(48);
        System.out.println("After manial sorting desc: " +ss);
        
        // before maniual sorting[1, 39, 48, 59, 69]
        //After manial sorting desc: [48, 33, 22]
    }
}
