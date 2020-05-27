package ru.gb.lesson1;

import java.util.Scanner;

public class MainClass {
    public static void main (String[] args){
        float a = 1;
        float b = 8;
        float c = 12;
        float d = 5;
        System.out.println(a * (b + (c / d)));

        task2();
        task3();
        task4();
        task5();
        task6();
    }

     public static boolean task2(){
        int x = 10;
        int y = 8;
        int z = x + y;
        int min = 10;
        int max = 20;
        if (min >= z && z <= max)
            return true;
        else
        return false;
    }
    public static void task3(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = in.nextInt();
        if (num < 0)
            System.out.println(num + " - отрицательное число");
        else System.out.println(num + " - положительное число");
    }
    public static boolean task4(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = in.nextInt();
        if (num < 0)
            return true;
        else
            return false;
    }
    public static void task5(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите свое имя: ");
        String name = in.next();
                    System.out.println("Привет, " + name + "!");
    }
    public static void task6(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        String year = in.next();
        int numb2 = Integer.parseInt(year);
        int numb3 = numb2 % 4;
        int numb4 = numb2 % 100;
        int numb5 = numb2 % 400;
        if (numb3 == 0 && numb4 > 0)
        System.out.println(year + " год висовосный");
        else if (numb5 == 0)
            System.out.println(year + " год висовосный");
        else
            System.out.println(year + " год не високосный");
    }
}
