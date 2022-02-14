public class StackOfIntegers {
    private int elements[];
    private int size=0;
    

    public StackOfIntegers() {
        elements = new int[16];
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public boolean empty(){
        if (this.size == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public int peek(){
        int data;
        data = elements[size-1];
        return data;
    }

    public void push(int value){
        elements[size]=value;
        size++;
    }

    public int pop(){
        int value;
        size--;
        value = elements[size];
        return value;
    }

    public int getSize() {
        return size;
    }

}