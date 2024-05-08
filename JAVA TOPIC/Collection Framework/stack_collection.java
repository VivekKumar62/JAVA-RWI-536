import java.util.Stack;

public class stack_collection {
    public static void main(String[] args) {
        Stack<String> Name = new Stack<>(); //LIFO

        // push used for insert

        Name.push("Thor");
        Name.push("Loki");
        Name.push("Spiderman");

        System.out.println(Name);
        Name.pop(); // remove but , last element will remove because last  in first  out
        System.out.println(Name);
        Name.set(1,"ashish");
        System.out.println(Name);

    }
}
