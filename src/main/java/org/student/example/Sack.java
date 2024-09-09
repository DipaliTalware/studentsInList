package org.student.example;

import java.util.Arrays;
import java.util.List;

public class Sack {
    private int[] elements = new int[10];
    private int size = 0;

    public boolean add(int element) {
        elements[size] = element;
        size++;
        return true;
    }

    public int size() {
        return elements.length;
    }

    public int get(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("Index out of bound");
        }
        return elements[index];
    }

    public boolean removeLast() throws Exception {
        if (size == 0) {
            throw new Exception("Sack is Empty");
        }
        size--;
        return true;
    }

    public boolean removeByIndex(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("Index out of bounds");
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return true;
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
        System.out.println();
    }


}
