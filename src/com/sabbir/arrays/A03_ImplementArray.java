package com.sabbir.arrays;

import java.util.ArrayList;

public class A03_ImplementArray {
    int index = 0;
    ArrayList<String> arrayList;

    public A03_ImplementArray() {
        index = 0;
        arrayList = new ArrayList<String>();
    }

    public String get(int index) {
        return arrayList.get(index);
    }

    public int add(String item) {
        arrayList.add(item);
        index++;
        return index;
    }

    public int pop() {
        arrayList.remove(index - 1);
        index--;
        return index;
    }

    public String[] delete(int index) {
        arrayList.remove(index);
        return (String[]) arrayList.toArray();
    }

    public static void main(String[] args) {
        A03_ImplementArray implementArray = new A03_ImplementArray();
        implementArray.add("sabbir");
        implementArray.add("Alam");
        System.out.println(implementArray.get(1));
        implementArray.pop();
        System.out.println(implementArray.get(0));
        System.out.println(implementArray.get(1));
    }
}

