package priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MainHasta {
    public static void main(String[] args) {
        Queue<Hasta> queue = new PriorityQueue<Hasta>();
        queue.offer(new Hasta("Ramazan Tunay","Baş ağrısı"));
        queue.offer(new Hasta("Ahmet Demir","Yanık"));
        queue.offer(new Hasta("Apo Demir","Apandis"));
        queue.offer(new Hasta("Erkam Bozan","Baş ağrısı"));
        queue.offer(new Hasta("Mehmet Kule","Apandis"));
        int i =1;
        while (queue.isEmpty() != true){
            System.out.println("********************");
            System.out.println(i+".Sırada");
            System.out.println(queue.poll());
            i++;
        }


    }
}
