package dz2;

import javafx.concurrent.Task;

import javax.swing.*;
import java.sql.SQLOutput;

public class Main<length> {

    public static void main(String[] args) {
//1
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

//2
        int[] arr = new int[8];
        int j = 0;

        for (int i = 0; i < arr.length; i++ , j = j + 3) {
            arr[i] = j;
            System.out.print(+arr[i] + " ");
//    }
//3
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int maxW = mas.length;
        for (int i = 0; i < maxW; i++) {
            if (mas[i] < 6) mas[i] = mas[i] * 2;
        }
        for (int i = 0; i < maxW; i++) {
            System.out.println(mas[i] + " ");
        }
    }
}

//4 Не разобрался как сделать задание
        int[][] arr = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
//                ...
                        System.out.print();
                }
                System.out.println();
            }
        }
    }
















