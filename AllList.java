package balaji;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;

class MyArrayList {
    public MyArrayList() {
        System.out.println("Students from MyArrayList");
    }
}

class MyLinkedList {
    public MyLinkedList() {
        System.out.println("Students from MyLinkedList");
    }
}

class MyHashMap {
    public MyHashMap() {
        System.out.println("Students and names from MyHashMap");
    }
}

class MyHashSet {
    public MyHashSet() {
        System.out.println("Students from MyHashSet");
    }
}

public class AllList {

    public static void main(String[] args) {
        // Using Java's built-in ArrayList
        ArrayList<String> ob = new ArrayList<>();
        ob.add("thanu");
        ob.add("mohan");
        ob.add("mohan");
        ob.add("hadhya");
        ob.add("chitti");
        System.out.println("ArrayList contents: " + ob);

        // Using custom classes
        MyArrayList a = new MyArrayList();
        MyLinkedList b = new MyLinkedList();
        MyHashSet c = new MyHashSet();
        MyHashMap d = new MyHashMap();
    }
}
