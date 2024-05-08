import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list_Demo {
    public static void main(String[] args) {
            List l=new ArrayList<>();

           l.add(10);
           l.add(20);
           l.add(30);
           l.add(40);
           l.add(50);
           l.add(30);
           l.add(10);
           l.add(null);
           l.add(null); // null can also store in list but nut store in the set

//        System.out.println(l);

        // now will print all element one  by one

       Iterator itr=l.iterator(); //return value in interface
       while(itr.hasNext())
       {
           System.out.println(itr.next());
       }



            }
}
