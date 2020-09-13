package Zadanie_2;

import java.util.Arrays;

public class MainZ8 {
    public static void main(String[] args){
        int[] mas ={1,-10,5,6,45,23,-45,34,0,32,56,-1,2,-2};
        int max = mas[0];
        for (int i = 1; i < mas.length; i++) max = Math.max(max, mas[i]);
        System.out.println(max +"- Максимальное значение");

    }

}
