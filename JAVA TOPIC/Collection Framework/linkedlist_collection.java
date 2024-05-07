import java.util.LinkedList;

//linked list in collection  linlist store in linklist and store just like doubly
public class linkedlist_collection {
    public static void main(String[] args) {

        LinkedList<String> Name= new LinkedList<String>();

        Name.add("vivek"); //add
        Name.add("bikku");
        System.out.println(Name);
        Name.addFirst("Rohit ");
        System.out.println(Name);
        Name.addLast("ashish ");
        System.out.println(Name);
        Name.add(2,"Railworld");
        System.out.println(Name);
        Name.remove();
        System.out.println(Name);
        Name.removeFirst();
        System.out.println(Name);
        Name.removeLast();
        System.out.println(Name);
        Name.contains(1);
        System.out.println(Name);


//        Name.add("Tony"); //add
//        Name.add("Captain");
//        for(String str:Name){
//            System.out.println(str);
//        }
    }
}
