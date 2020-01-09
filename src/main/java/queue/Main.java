package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    //Queue (Kuyruk) İnterface yi implemente eden linkedlist classı FIFO mantığı il çaslışır(First İn First Out)
    //add(elaman)-> elamanı kuyruğa ekler. ekleyemezse hata verir.
    //offer(Eleman) -> elemanı kuyruğa ekler ekleyemezse false eklerse true değer atar.
    //remove() -> kuyruğun ilk elamnını kuyruktan çıkarır.kuruk boşsa hata verir.
    //poll()->kuyruğun ilk elamnını kuyruktan çıkarır. kuyruk boşsa null değer verir.
    // element()->Kuyruğun ilk elamanını döner. Kuyruk boşsa hata verir.
    //peek()-> Kuruğun ilk elemanını döner.Kuyruk boşsa null değer döner.
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("java");
        queue.offer("c++");
        queue.offer("c#");
        queue.offer("Ramazan");
        for (int i=0;i<=queue.size();i++){

            for (int j=0;j<=queue.size();j++){

                System.out.println(queue);
                queue.poll();

            }
        }
    }
}
