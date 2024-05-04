interface studentProfile{
    void object();
}

class Student implements studentProfile{

    public void object()
    {
        System.out.println("Student ID-123");
        System.out.println("Student Name:- Vivek");
        System.out.println("Student Mob no:- 6201662075");
        System.out.println("Location:- Indore ");
    }

    public static void main(String args[]){
        Student studentId = new Student();
        studentId.object();
    }
}
