package org.lessons.java.utils;

public class IntList {
    int[] arr;
    int i = 0;

    public IntList(int[] arr) {
        this.arr = arr;
    }

    public IntList() {
        this.arr = new int[0];
    };

    public int getNext() {
        i++;
        return arr[i - 1];
    }

    public boolean hasNext() {
        if (i == arr.length) {
            return false;
        }
        return true;
    }

    public void addNewInt(int n) {
        int arrLength = this.arr.length;

        int[] newArr = new int[arrLength + 1];

        for (int i = 0; i < arrLength; i++) {
            newArr[i] = this.arr[i];
        }

        newArr[arrLength] = n;

        this.arr = newArr;
    }
}
