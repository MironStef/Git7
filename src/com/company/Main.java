package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scanner.nextInt();
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("Fibonacci of " + n + " = " + fibonacci.fibonacci(n));
    }
}
