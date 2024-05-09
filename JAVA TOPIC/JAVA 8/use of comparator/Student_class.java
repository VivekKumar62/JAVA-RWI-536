import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student_class {
    public static void main(String[] args) {
        Student s1 = new Student(21, "vivek");
        Student s2 = new Student(32, "Marvel");
        Student s3 = new Student(33, "Ayushman");
        List<Student> li = new ArrayList<Student>();
          li.add(s1);
        li.add(s2);
    li.add(s3);
         Collections.sort(li, (a, b) -> b.id - a.id);
        System.out.println(li);
    }
}

class Student {
    public Integer id;
     public String name;

    public Student(Integer id, String name) {
          this.id = id;
        this.name = name;
    }

    public String toString() {
                return this.id + ": " + this.name;
    }
}


//[33: Ayushman, 32: Marvel, 21: vivek]
