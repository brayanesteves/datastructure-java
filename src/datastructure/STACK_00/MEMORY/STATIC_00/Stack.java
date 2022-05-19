package datastructure.STACK_00.MEMORY.STATIC_00;

/**
 *
 * @author brayan
 */
public class Stack {
    int vectorStack[];
    int peak;
    
    public Stack(int size) {
        this.vectorStack = new int[size];
        this.peak = -1;
    }
    
    public void push(int data){
        this.peak++;
        vectorStack[peak] = data;
    }
    
    public int pop() {
        int out = this.vectorStack[this.peak];
        this.peak--;
        return out;
    }
    
    public boolean isEmpty() {
        return this.peak == -1;
    }
    
    public boolean isFilled() {
        return this.vectorStack.length - 1 == this.peak;
    }
    
    public int peakStack() {
        return this.vectorStack[this.peak];
    }
    
    public int sizeStack() {
        return this.vectorStack.length;
    }
}
