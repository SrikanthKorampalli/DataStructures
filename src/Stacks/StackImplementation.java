package Stacks;

public class StackImplementation {
        public static void main(String[] args) {
            StackClass stack = new StackClass(5);

            System.out.println("Pushing elements:");
            for (int i = 1; i <= 6; i++) {
                boolean pushed = stack.push(i * 10);
                if (pushed) {
                    System.out.println("Pushed: " + (i * 10));
                } else {
                    System.out.println("Stack is full. Could not push: " + (i * 10));
                }
            }

            System.out.println("\nTop element (peak): " + stack.peak());
            System.out.println("\nPopping elements:");
            while (!stack.isEmpty()) {
                System.out.println("Popped: " + stack.pop());
            }
            System.out.println("Trying to pop from empty stack: " + stack.pop());

            System.out.println("\nIs stack empty? " + stack.isEmpty());

            System.out.println("Current stack size: " + stack.size());
        }
    }


