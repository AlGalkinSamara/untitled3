

package Zadanie_2;
import java.util.Scanner;

public class MainZ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();

        System.out.println(num.substring(num.length() - 1));
    }
}
