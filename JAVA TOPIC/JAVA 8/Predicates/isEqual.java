import java.util.function.Predicate;

public class isEqual {

    public static void main(String[] args) {

        Predicate<String> startsWithLetterV = x-> x.toLowerCase().charAt(0) == 'v';
        Predicate<String> endsWithLetterL = x-> x.toLowerCase().charAt(x.length() -1) == 'l';
   Predicate<String> predicate= Predicate.isEqual("Suryansh");
        System.out.println(predicate.test("jhgvbnvb"));
        System.out.println(predicate.test("Suryansh"));

//        Student S1 = new Student("vishal" , 1);
//        Student S2= new Student("vicky" , 2);
//        Predicate<Student> studentPredicate = x->x.getId()> 1;
//        System.out.println(studentPredicate.test(S2));
    }

    private static class Student {
        String name;
        int id;

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }
    }
}
