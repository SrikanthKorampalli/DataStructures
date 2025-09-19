package Stacks;

public class ArrayListImplementation {
        public static void main(String[] args) {
            ArrayListClass list = new ArrayListClass();

            System.out.println("Adding elements:");
            for (int i = 1; i <= 15; i++) {
                list.add(i * 5);
                System.out.println("Added: " + (i * 5));
            }

            System.out.println("\nCurrent list:");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }

            System.out.println("\n\nElement at index 5: " + list.get(5));

            boolean setResult = list.set(5, 999);
            System.out.println("Set index 5 to 999: " + (setResult ? "Success" : "Failed"));

            boolean removeResult = list.remove(3);
            System.out.println("Removed element at index 3: " + (removeResult ? "Success" : "Failed"));
            System.out.println("\nUpdated list:");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }

            System.out.println("\n\nTrying to get element at invalid index 100: " + list.get(100));
            System.out.println("Trying to set value at invalid index -1: " + list.set(-1, 123));
            System.out.println("Trying to remove element at invalid index 50: " + list.remove(50));
        }
    }

