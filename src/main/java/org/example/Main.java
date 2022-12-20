package org.example;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
//        Вывести список на экран в перевернутом виде (без массивов)
//        Пример:
//        1 -> 2->3->4
//        Вывод:
//        4->3->2->1

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размерность списка");
        int n = scanner.nextInt();
        System.out.println("введите элементы списка");
        for (int i = 0; i < n; i++) {
            integerLinkedList.add(scanner.nextInt());
        }
        Stack<Integer> st = new Stack<>();
        for (var listValue : integerLinkedList) {
            st.push(listValue);
        }
        System.out.print("revers = ");
        for (int i = 0; i < integerLinkedList.size(); i++) {
            System.out.print(st.pop() + " ");
        }
    }

    public static void task2() {
//        Определить является ли список знакочередующимся? (без массивов)

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int numA;
        int numB;
        boolean indication = true;
        System.out.println("введите размерность списка >0 ");
        int n = scanner.nextInt();
        System.out.println("введите элементы списка");
        numA = scanner.nextInt();
        integerLinkedList.add(numA);
        for (int i = 1; i <= n - 1; i++) {
            numB = scanner.nextInt();
            integerLinkedList.add(numB);
            if (((numA > 0) && ((numB * (-1)) < 0)) || ((numA < 0) && ((numB * (-1)) > 0))) {
                indication = false;
            }
            numA = numB;
        }
        System.out.print("список знакочередующийся - " + indication);
    }
}