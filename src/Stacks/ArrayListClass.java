package Stacks;

    public class ArrayListClass {
        private int[] arr;
        private int capacity;
        private int size;

        public ArrayListClass(){
            capacity = 10;
            arr = new int[capacity];
            size = 0;
        }

        public void add(int x){
            if(size == capacity){
                resize();
            }
            arr[size++] = x;
        }

        public int get(int ind){
            if(ind<0 || ind>=size){
                return -1;
            }
            return arr[ind];
        }

        public boolean remove(int index){
            if(index<0 || index>=size){
                return false;
            }
            for(int i = index;i<size-1;i++){
                arr[i] = arr[i+1];
            }
            size--;
            return true;
        }

        public void resize(){
            int incSize = size/2;
            capacity+=incSize;
            int[] newArr = new int[capacity];
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }

        public int size(){
            return size;
        }

        public boolean set(int ind, int value){
            if(ind<0 || ind >=size){
                return false;
            }
            arr[ind] = value;
            return true;
        }

    }

