import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_demo_Collection {
    public static void main(String[] args) {


        List l=  new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add("vivek");
        l.add("Rohit");
        l.add("Tony stark");

//        System.out.println(l);

        Iterator its= l.iterator();
        while(its.hasNext()){
            System.out.println( its.next());
        }



    }
}
