public class CreateThreadUsingLambdaExpr {
    public static void main(String[] args) {
        Runnable runnable = ()-> {
            for (int i=1; i<=10; i++){
                System.out.println("hello dear" + i);
            }
        };

        Thread childThread = new Thread(runnable);
        childThread.start();
    }
}
