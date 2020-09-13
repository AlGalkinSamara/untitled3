package Zadanie_2;
import java.util.Arrays;
import java.util.Scanner;
public class MainZ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String str = String.valueOf(num);

        System.out.println(Integer.parseInt(str.substring(0,1)) + Integer.parseInt(str.substring(1,2)) + Integer.parseInt(str.substring(2,3)));

    }
}
