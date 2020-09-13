package Zadanie_2;

import java.util.Scanner;

public class MainZ4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num >0) {
            System.out.println(++num);
        } else if (num <0){
            System.out.println(num-2);
        } else  {
            System.out.println(10);
        }

    }
}