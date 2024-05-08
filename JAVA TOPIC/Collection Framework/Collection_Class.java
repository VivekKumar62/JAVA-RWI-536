import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collection_Class {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(55);
        list.add(45);
        list.add(98);
        list.add(65);
        list.add(25);
        list.add(19);
        list.add(15);
        list.add(80);

        System.out.println(list);

//        System.out.println("min element "+ Collections.min(list));
//        System.out.println("max element "+ Collections.max(list));
//        System.out.println(Collections.frequency(list,80));
//        Collections.sort(list);

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);



    }
}
