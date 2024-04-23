package com.javaprograms;

import java.util.ArrayList;
import java.util.List;

public class CustomStack {
    private List<Integer> stack;

    public CustomStack() {
        stack = new ArrayList<>();
    }

    public void push(int item) {
        stack.add(item);
    }

    public Integer pop() {
        if (isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    public Integer peek() {
        if (isEmpty()) {
            return null;
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();

        stack.push(9);
        stack.push(13);
        stack.push(7);

        System.out.println("Peek: " + stack.peek()); 
        System.out.println("Pop: " + stack.pop());  
        System.out.println("Pop: " + stack.pop());
        
        System.out.println("Is Empty: " + stack.isEmpty()); 
        System.out.println("Pop: " + stack.pop());  
        System.out.println("Is Empty: " + stack.isEmpty());  
    }
}
