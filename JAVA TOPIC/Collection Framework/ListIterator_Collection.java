import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_Collection {
    public static void main(String[] args) {
        List<Object> l = new ArrayList<>();
        l.add(10);
        l.add("Vivek");
        l.add("Ram");

        ListIterator<Object> li = l.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }
        System.out.println("----------");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
