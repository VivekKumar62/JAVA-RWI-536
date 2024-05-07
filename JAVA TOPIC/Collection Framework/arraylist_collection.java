


   //collection  array add list
import java.util.ArrayList;

public class arraylist_collection {
    public static void main(String[] args) {
        ArrayList<String> Name = new ArrayList<String>();
        Name.add("vivek");      //add
        Name.add("bikku");
        Name.add("bittu");
        System.out.println(Name); //print
        Name.add("deadpool");
        System.out.println(Name);
        Name.add(1, "marvel"); //index set name
        System.out.println(Name);
        Name.add(0, "MCU");
        System.out.println(Name);
        Name.remove(0); // remove element
        System.out.println(Name); //print
        Name.set(0,"ROHIT"); // replace
        System.out.println(Name);  //print
        System.out.println(Name.get(2)); // only print 2no element
        Name.clear(); // clear all
        System.out.println(Name);

        //add all

        ArrayList <String> Names = new ArrayList<String>();
        Names.add("TATA");
        Names.add("Accenture");

        Name.addAll(Names);
        System.out.println(Name);

    }
}
