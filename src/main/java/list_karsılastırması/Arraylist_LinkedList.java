package list_karsılastırması;
// burada iki liste sınıfının çalışma performansını karşılaştırarak ne kadar sürede çalıştığına bakıtoruz.
/*Eğer yğksek size da bir liste yapılacak ve eklenecek ise linkedlist kullanmak daha manktıklı çünkü daha hızlı
lakin liste size yıdüşük ise arraylist kullanmak daha güzel olabilir.*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arraylist_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //zamanHesapla("LinkedList",linkedList);
        zamanHesapla("ArrayList", arrayList);

    }
    public static void zamanHesapla(String veri_tipi, List<Integer> list){
        long baslangıc;
        long bitis;
        // currentMillis zamanı hesaplayan kod
        baslangıc = System.currentTimeMillis();
        for (int i=0; i<100000;i++){
            //list.add(i);// direk ekleme olnca arraylist daha hızlı oluyor.
            list.add(0,i);// eğer böyle index ile yapınca linkedlist daha hızlı
        }
        bitis =System.currentTimeMillis();
        System.out.println(veri_tipi +"ekleme süresi="+  (bitis-baslangıc)+ "ms");
    }
}
