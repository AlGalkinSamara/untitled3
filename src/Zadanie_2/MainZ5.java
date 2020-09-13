package Zadanie_2;

import java.util.Scanner;

public class MainZ5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.println("Введите числа");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        System.out.println(Math.min(Math.min(a,b),c));

    }
}
