package com.javaprograms;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void removeSecond(List<Integer> lis) {
        for (int i = lis.size() - 1; i >= 0; i--) {
            if (i % 2 == 1) {
                lis.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> L = new ArrayList<>();
        L.add(71);
        L.add(23);
        L.add(91);
        L.add(19);
        L.add(3);
        L.add(5);
        L.add(13);
        L.add(8);
        L.add(6);
        L.add(69);

        System.out.println("Original List: " + L);

        removeSecond(L);

        System.out.println("List after removing every second element: " + L);
    }
}
