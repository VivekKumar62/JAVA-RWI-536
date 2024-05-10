interface Employees {
    String getSalary();
}

public class VariableThisLambdaExpression {
    private void doSomething() {
        Employees employees = () -> {
            return "100";    // *
        };

        Employees employees1 = new Employees() {
            int x = 100;
            @Override
            public String getSalary() {
                return "100000";
            }
        };
        System.out.println(employees.getSalary());
        System.out.println(employees1.getSalary());
    }

    public static void main(String[] args) {
        VariableThisLambdaExpression finalsalary = new VariableThisLambdaExpression();
        finalsalary.doSomething();
    }
}
