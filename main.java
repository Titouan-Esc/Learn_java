import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String []args) {
//        ExecutorService ex = Executors.newSingleThreadExecutor();
//        ExecutorService ex = Executors.newFixedThreadPool(4);
        ExecutorService ex = Executors.newCachedThreadPool();


        Runnable task1 = () -> {

            for (int i = 0; i < 5; i++) {
                System.out.println(i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
            }
        };

        Runnable task2 = () -> {

            for (int i = 5; i < 9; i++) {
                System.out.println(i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
            }
        };

        Future<String> fut1 = ex.submit(task1, "Je suis Jean et j'ai fini");
        Future<String> fut2 = ex.submit(task2, "Je suis Enculé et j'ai fini");

        while (!fut1.isDone() || !fut2.isDone()) {
            System.out.println("On attend...");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }

        if (fut1.isDone()) {
            try {
                System.out.println(fut1.get());
            } catch (Exception e) {}
        } else if (fut2.isDone()) {
            try {
                System.out.println(fut2.get());
            } catch (Exception e) {}
        }

        ex.shutdown();
    }
    
}
