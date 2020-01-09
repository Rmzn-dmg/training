package odev;

import java.util.ArrayList;
import java.util.Collections;

public class MedianCalculator {
    public static void median(ArrayList<Integer> list){

        int e;
        double medyan;
        e= list.size();
        if(e%2==0){
            System.out.println("Dizi çift");

            double ortaSayı = list.get(e/2);  //1,2,3,4,5,6
            double ortaSayı1 =list.get((e/2)-1);
            medyan = (ortaSayı + ortaSayı1)/2;
            System.out.println("Listenin Medyanı :" + medyan);


        }
        else {
            System.out.println("Dizi tek");
            medyan = list.get((e-1)/2);
            System.out.println("Listenin Medyanı :" + medyan);

        }

    }


    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(16);
        list1.add(2);
        list1.add(9);
        list1.add(3);
        list1.add(11);
        list1.add(6);



        Collections.sort(list1);
        System.out.println(list1);
        median(list1);








    }
}
