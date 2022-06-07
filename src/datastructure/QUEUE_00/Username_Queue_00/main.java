package datastructure.QUEUE_00.Username_Queue_00;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author brayan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        
        System.out.println("Init queue is: " + queue.peek());
        System.out.println("================");
        System.out.println("Truncate queue");
        queue.clear();
        System.out.println("================");
        int size = queue.size();
        while(!queue.isEmpty()){
            System.out.println("Dispatch at item: " + queue.remove());
        }
        System.out.println("================");
    }
    
}
