package odevler;

import java.util.Scanner;

public class fibonacciSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisi eleman sayisini girin: ");
        int elemanSayisi = scanner.nextInt();

        int fib1 = 0;
        int fib2 = 1;

        System.out.print("Fibonacci Serisi: " + fib1 + " " + fib2);

        for (int i = 2; i < elemanSayisi; i++) {
            int fib3 = fib1 + fib2;
            System.out.print(" " + fib3);

            fib1 = fib2;
            fib2 = fib3;
        }
        
    }
}
