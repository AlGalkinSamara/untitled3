package Zadanie_2;

import java.util.Scanner;

public class MainZ6 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            String Chet,Typ;

            if ( num % 2 == 0 && num !=0) {
                Chet=" четное";
            }
            else if (num % 2 != 0 ) {
                Chet=" нечетное";
            }
            else {Chet="";
            }
            if (num >0) {
                Typ="положительное";
            }
             else if (num <0) {
                Typ="отрицательное";
            }
              else {
                Typ="нулевое";
            }

            System.out.println(Typ+Chet+" число" );
        }
    }

