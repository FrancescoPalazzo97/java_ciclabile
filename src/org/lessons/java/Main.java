package org.lessons.java;

import org.lessons.java.utils.IntList;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 0, 1, 3, 4 };
        int[] arr2 = new int[] { 10, 20, 30 };

        IntList list1 = new IntList(arr1);
        IntList list2 = new IntList(arr2);
        IntList list3 = new IntList();

        list1.addNewInt(50);

        IO.println("------List 1------");
        while (list1.hasNext()) {
            IO.println(list1.getNext());
        }

        list2.addNewInt(40);

        IO.println("------List 2------");
        while (list2.hasNext()) {
            IO.println(list2.getNext());
        }

        list3.addNewInt(1);

        IO.println("------List 3------");
        while (list3.hasNext()) {
            IO.println(list3.getNext());
        }
    }
}
