package ru.gb.l2;

import java.util.Arrays;

public class MainClass {
    public static void main (String[] args){

    changeArr();
    setArr();
    multiplyArr();
    matrixArr();
    extremArr();
    }
    public static void changeArr() {
        int [] change = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
        System.out.println("Задание 1. Начальный массив: " + Arrays.toString(change));
        int i;
        for (i = 0; i < change.length; i++) {
            if (change[i] == 0) {change[i] = 1;}
            else change[i] = 0;
        }
        System.out.println("            Конечный массив: " + Arrays.toString(change));
    }
    public static void setArr() {
        int [] set = new int[8];
        int i;
        for (i = 0; i <= 7; i++) {
            set[i] = i * 3;
        }
        System.out.println("Задание 2. Сформированный массив: " + Arrays.toString(set));
    }
    public static void multiplyArr () {
        int[] multiply = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Задание 3. Начальный массив: " + Arrays.toString(multiply));
        int i;
        int a = 2;
        int b = 6;
        for (i = 0; i < multiply.length; i++) {
            if (multiply[i] < b) multiply[i] = multiply[i] * a;
        }
        System.out.println("           Конечный массив: " + Arrays.toString(multiply));
    }
    public static void matrixArr () {
        int [] [] matrix = new int [10] [10];
        int j = matrix.length - 1;
        int i;
        for (i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][j] = 1;
            j--;
        }
        System.out.println("Задание 4. Сформированный двумерный массив: " + Arrays.deepToString(matrix));
    }
    public static void extremArr () {
        int[] extrem = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Задание 5. Массив: " + Arrays.toString(extrem));
        int i;
        int j = 0;
        for (i = 1; i < extrem.length; i++) {
            if (extrem[i] > extrem[j]) j = i;
            }
        System.out.println("           Максимальное число равно: " + extrem[j]);
        for (i = 0; i < extrem.length; i++) {
            if (extrem[i] < extrem[j]) j = i;
        }
        System.out.println("           Минимальное число равно: " + extrem[j]);
    }
    }

