package estudo_1.lambda;

public class LambdaThread {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();

        new Thread(() -> System.out.println("Olá mundo")).start();

    }
}
