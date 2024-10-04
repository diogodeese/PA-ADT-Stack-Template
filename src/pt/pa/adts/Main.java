package pt.pa.adts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        int userInput = scanner.nextInt();

        System.out.println(DecimalToBinary.decimal2Binary(userInput));

        scanner.close();

	    //Stack<Integer> stack = new StackArrayList<>();
        Stack<Integer> stack = new StackLinkedList<>();

	    try {
            for (int i=0; i<100; i++) {
                stack.push(i);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

	    try {
            System.out.println("Stack is empty? " + stack.isEmpty());

            System.out.println("Top of stack is: " + stack.peek());

            System.out.println("Pop all elements from stack:");
            while(!stack.isEmpty()) {
                System.out.println(stack.pop());
            }

            System.out.println("Stack is empty? " + stack.isEmpty());

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
