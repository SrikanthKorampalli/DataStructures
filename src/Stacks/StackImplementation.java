package Stacks;

public class StackImplementation {
        public static void main(String[] args) {
            // Create a stack of size 5
            StackClass stack = new StackClass(5);

            // Push elements into the stack
            System.out.println("Pushing elements:");
            for (int i = 1; i <= 6; i++) {
                boolean pushed = stack.push(i * 10);
                if (pushed) {
                    System.out.println("Pushed: " + (i * 10));
                } else {
                    System.out.println("Stack is full. Could not push: " + (i * 10));
                }
            }

            // Peek at the top element
            System.out.println("\nTop element (peak): " + stack.peak());

            // Pop elements from the stack
            System.out.println("\nPopping elements:");
            while (!stack.isEmpty()) {
                System.out.println("Popped: " + stack.pop());
            }

            // Try popping from empty stack
            System.out.println("Trying to pop from empty stack: " + stack.pop());

            // Check if stack is empty
            System.out.println("\nIs stack empty? " + stack.isEmpty());

            // Check current size
            System.out.println("Current stack size: " + stack.size());
        }
    }


