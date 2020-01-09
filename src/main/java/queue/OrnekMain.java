package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class OrnekMain {
    public static void main(String[] args) throws InterruptedException {
        Queue<String> queue = new LinkedList<String>();
        Random random = new Random();
        queue.offer("Ahmet");
        queue.offer("Mehmet");
        queue.offer("Erkam");
        queue.offer("Demir");
        queue.offer("Tunay");
        queue.offer("Bozan");
        queue.offer("SAlim");
        queue.offer("Turşucu");
        queue.offer("Sofi");
        queue.offer("Ramazan");
        int pide_sayısı =1+random.nextInt(10);
        System.out.println("Pİdeler çığorr HAA:: FOREYLERRR");
        System.out.println("Pide sayısı ."+ pide_sayısı);
        Thread.sleep(3000);
        while (pide_sayısı!=0){
            System.out.println(queue.poll()+"pideyi alor ha :"+ " "+"Şanslı Forreyy");
            pide_sayısı--;
            Thread.sleep(1000);
        }
        System.out.println(" A:Bize yoğ mı");
        System.out.println("B:Pide bitti  o kadar seslenoğ duymom mu Forrey:");
        System.out.println(" A:Çıimino Sıllo merriye");


    }
}
