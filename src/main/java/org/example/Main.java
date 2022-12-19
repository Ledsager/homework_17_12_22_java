package org.example;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        task3();
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
        boolean indication=true;
        System.out.println("введите размерность списка >0 ");
        int n= scanner.nextInt();
        System.out.println("введите элементы списка");
        numA=scanner.nextInt();
        integerLinkedList.add(numA);
        for (int i = 1; i <= n-1; i++) {
            numB=scanner.nextInt();
            integerLinkedList.add(numB);
            if (((numA>0)&&((numB*(-1))<0))||((numA<0)&&((numB*(-1))>0))){
                indication=false;
            }
            numA=numB;
        }
        System.out.print("список знакочередующийся - "+indication);
    }

    public static void task3() {
//        Вывести список на экран в перевернутом виде (без массивов)
//        Пример:
//        1 -> 2->3->4
//        Вывод:
//        4->3->2->1

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("введите размерность списка");
        int n = scanner.nextInt();
        System.out.println("введите элементы списка");
        for (int i = 0; i < n; i++) {
            integerLinkedList.add(scanner.nextInt());
        }

        for (int i = 0; i < 2; i++){
            int c=integerLinkedList.remove(i);
            System.out.println(c);
            int b=integerLinkedList.remove(n-2-i);
            integerLinkedList.addLast(c);
            integerLinkedList.set(c,b);
        }
//        Stack<Integer> st = new Stack<>();
//        for (var listValue : integerLinkedList) {
//            st.push(listValue);
//        }
//        System.out.print("revers = ");
//        for (int i = 0; i < integerLinkedList.size(); i++) {
//            System.out.print(st.pop() + " ");
//        }
        System.out.println(integerLinkedList);
    }
}
//import java.util.LinkedList;
//        import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        LinkedList<Integer> integerLinkedList = new LinkedList<>();
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//            integerLinkedList.add(scanner.nextInt());
//        }
//        System.out.println("peek = " + integerLinkedList.peek());
//        System.out.println("list= " + integerLinkedList);
//        System.out.println("pop = " + integerLinkedList.pop());
//        System.out.println("list= " + integerLinkedList);
// //добавим вначало
//        integerLinkedList.addFirst(3);
//        System.out.println("add first list= " + integerLinkedList);
////добавление в конец
//        integerLinkedList.addLast(7);
//        System.out.println("add last list= " + integerLinkedList);
////замена элемента
//        integerLinkedList.set(2, 6);
//        System.out.println("set elem list= " + integerLinkedList);
////проверить на наличие
//        System.out.println("search element list(true/false)= " + integerLinkedList.contains(6));
////удаление элемента (индекс)
//        integerLinkedList.remove( 1);
//        System.out.println("remove elem list= " + integerLinkedList);
////удаление элемента (объект)
//        integerLinkedList.remove( (Integer) 6);
//        System.out.println("remove elem list= " + integerLinkedList);
//    }
//}