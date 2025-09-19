package Stacks;

public class StackClass {
        private int[] arr;
        private int top;
        private int size;

        public StackClass(int size){
            this.size = size;
            top = -1;
            arr = new int[size];
        }

        public boolean push(int x){
            if(top == size-1){
                return false;
            }
            arr[++top] = x;
            return true;
        }

        public int pop(){
            if(top == -1){
                return -1;
            }
            return arr[top--];
        }

        public int peak(){
            if(top == -1){
                return -1;
            }
            return arr[top];
        }

        public boolean isEmpty(){
            return top == -1;
        }

        public int size(){
            return top+1;
        }

    }

