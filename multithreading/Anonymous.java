package multithreading;

public class Anonymous {
    public static void main(String[] args) {
        Runnable r = new Runnable() {

            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i <= 5; i++) {
                    sum += i;
                }
                System.out.println("Sum: " + sum);
            }
        };

        new Thread(r).start(); // Moved outside of the anonymous class declaration
    }
}
