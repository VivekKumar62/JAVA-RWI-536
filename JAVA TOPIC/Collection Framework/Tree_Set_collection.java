import java.util.Set;
import java.util.TreeSet; //log in

public class Tree_Set_collection {
    public static void main(String[] args) {
        Set<Integer> treeset= new TreeSet<>(); // behind tht scene sorted form and work on  binary tree implements
                                               // and define set properties all element will unique and elements
                                               // will be sorted form
         treeset.add(10);
        treeset.add(20);
        treeset.add(8);
        treeset.add(40);
        System.out.println(treeset);
//[8, 10, 20, 40]


    }
}
