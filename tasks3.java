package homeWork1;

import java.util.ArrayList;
import java.util.Random;

import static java.util.Collections.max;
import static java.util.Collections.min;


public class tasks3 {
    public static void main(String[] args) {
        newList(); // задача 1
        newList2(); // задача 2
    }
    public static void newList () {
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int dig = rnd.nextInt(1, 100);
            list1.add(dig);
        }
        System.out.printf("Исходник %s\n", list1);
        int i = 0;
        while (i < list1.size()) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
            } else {
                i++;
            }
        }
        System.out.printf("Результат %s", list1);
        }
    public static void newList2 () {
        Random rnd = new Random();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int dig = rnd.nextInt(1, 100);
            list2.add(dig);
        }
        System.out.printf("Список %s\n", list2);
        int max = max(list2);
        int min = min(list2);
        int sum = 0;
        for (int i : list2) {
            sum += i;
        }
        float aver = (float)sum/list2.size();
        System.out.printf("Максимальный элемент: %s\n", max);
        System.out.printf("Минимальный элемент: %s\n", min);
        System.out.printf("Сумма всех элементов: %s\n", sum);
        System.out.printf("Среднее арифметическое: %s\n", aver);
    }

}