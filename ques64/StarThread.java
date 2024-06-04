package ques64;

import java.util.Scanner;

public class StarThread {
    private int n = 0;

    public StarThread() {
        this.n = 3;
    }

    public StarThread(int n) {
        this.n = n;
    }

    public void pattern() {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                try {
                    Thread.sleep(1000);
                    System.out.print("* ");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n= s.nextInt();
        StarThread t = new StarThread(n);
        t.pattern();
        s.close();
    }
}
