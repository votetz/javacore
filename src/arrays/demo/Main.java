package arrays.demo;

import arrays.list.impl.IntArrayList;

public class Main {
    public static void main(String[] args) {
        IntArrayList list = new IntArrayList();
//        for (int i = 100; i < 115; i++) {
//            list.add(i);
//        }
//
//        System.out.println("List size: " + list.size());
//        System.out.println("List elements:");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println();
//
//        list.set(0, 999);
//        System.out.println("After setting index 0 to 999:");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println();
//
//        for (int i = 0; i < 15; i++) {
//            System.out.println("Removing element at index 0: " + list.remove(0));
//            System.out.println("List size: " + list.size());
//        }
//        System.out.println();
//
//        list.add(42);
//        list.add(42);
//
//        System.out.println("After adding two 42s:");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println("List size: " + list.size());
//
//        list.add(10);
//        list.add(20);
//        list.add(30);
//
//        list.add(0, 15);
//        System.out.println("After adding 15 at index 1:");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
//
//        list.add(1, 15);
//        System.out.println("After adding 15 at index 1:");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
//
//        list.add(3, 15);
//        System.out.println("After adding 15 at index 3:");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println();

        list.add(4);
        list.add(8);
        list.add(4);

        System.out.println("After adding 4, 8, and 4:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println(list.indexOf(4));
        System.out.println(list.indexOf(5));
    }
}
