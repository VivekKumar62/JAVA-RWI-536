
abstract class hardsjava {
    abstract void printInfo();
}

class Employee extends hardsjava {
    void printInfo()
    {
        String name = "vivek";
        int age = 22;
        int  salary = 32000;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

class Basejava {
    public static void main(String args[])
    {
        hardsjava s = new Employee();
        s.printInfo();
    }
}
