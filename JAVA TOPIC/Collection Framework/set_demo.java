import java.util.HashSet;
import java.util.Set;

public class set_demo {
    public static void main(String[] args) {
    Set s= new HashSet();

    s.add(10);
    s.add(20);
    s.add(30);
    s.add(40);
    s.add(50);
    s.add(20); //set doest not allow to store duplicate element
    s.add(null);
    s.add(null); //set store only one null value

    System.out.println(s);


    }
}
