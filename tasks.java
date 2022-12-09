package homeWork1;

import java.util.Scanner;

public class tasks {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        print(isPositive(input())); //задача 3
        isPos(input()); //задача 2
        sum(); //задача 1
        replay(firstInp(), secondInp()); //задача 4
        replace(arr1); //задача 6
        newAr(100); //задача 7
        squareAr(arr2); //задача 8
        dualAr(); //задача 9
        valIn(7,2);
    }

    public static boolean isPositive(int x) {
        return x >= 0;
    }

    public static void isPos(int x) {
        if (x >= 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }

    public static int input() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = iScanner.nextInt();
        //iScanner.close();
        return x;
    }

    public static void print(boolean isPositive) {
        System.out.println(isPositive ? "Положительное" : "Отрицательное");
    }

    public static void sum() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = iScanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = iScanner.nextInt();
//        iScanner.close();
        if ((a + b) > 10 && (a + b) < 20) {
            System.out.println(a + b);
        } else {
            System.out.println("Условие не входит в рамки 10>число<20");
        }
    }

    public static int firstInp() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
//        int z = iScanner.nextInt();
        return iScanner.nextInt();

    }

    public static String secondInp() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите текст");
        //String a = iScanner.next();
        return iScanner.nextLine();
    }

    public static void replay(int z, String a) {
        for (int i = 0; i <= z; i++) {
            System.out.println(a);
        }
    }

    public static void replace(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void newAr(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public static void squareAr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void dualAr() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void valIn(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
}
