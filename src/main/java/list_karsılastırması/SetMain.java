package list_karsılastırması;
//Set interface ----->HAshSeet,LİnkendHashSet,TreeSet bunlar set interface yi implemente ederler.
/*NotLAR: burada bu 3 Set fonksiyonlu liste her eleamnı 1 kere kaydeder kaç sefer eklemek istersen iste yanlızca 1 defa kaydeder.*/

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
        Set<String> set1 =  new HashSet <String>();
        Set<String> set2 =  new LinkedHashSet<>();
        Set<String> set3 =  new TreeSet<String>();
        //HashSet
        set1.add("Java");
        set1.add("Ramazan");
        set1.add("Eşref");
        set1.add("Ahmet");
        //LinkedHashSet
        set2.add("Java");
        set2.add("Ramazan");
        set2.add("Eşref");
        set2.add("Ahmet");
        //TreeSet
        set3.add("Java");
        set3.add("Ramazan");
        set3.add("Eşref");
        set3.add("Ahmet");
        System.out.println("*******HashSet************");
        for (String s:set1) {
            System.out.println(s);

        }System.out.println("*******LinkedHashSet************");
        for (String s:set2) {
            System.out.println(s);

        }System.out.println("*******TreeSet************");
        for (String s:set3) {
            System.out.println(s);

        }
        System.out.println(set1.contains("Ramazan"));// contains methodu var mı yok mu anlamıda çalışır ve boolean sonuç atar.
        System.out.println(set1.contains("Tunay"));
        System.out.println("---------------------------");

        // 2 küme arasında kiş eleman farkını bulma
        Set<String> set4 = new HashSet<String>();
        Set<String> set5 = new HashSet<String>();
        set4.add("Java");
        set4.add("Ramazan");
        set4.add("Eşref");
        set4.add("Ahmet");
        set5.add("Java");
        set5.add("ali");
        set5.add("Mehmet");
        set5.add("Ahmet");
        Set<String > fark = new HashSet<>(set5);// burad 2 küme arasında ki eleman farkı na baktık
        System.out.println(fark.removeAll(set4));// önce boolean değer atar
        System.out.println(fark);// hangi elemen diğerinde yok yazar
        System.out.println("______--------");
        //keşimide bulamak için;
        Set<String> kesisim = new HashSet<String>(set5);// burada da 2 küme arasında ki ortak elamana baktık.
        System.out.println(kesisim.retainAll(set4));// boolean değer atar.
        System.out.println(kesisim);// ortak elamanı yazar.
        System.out.println("******----****");
        // birleşim olarak elamanları yazma
        Set<String> birleşim = new HashSet<String>(set4);
        System.out.println(birleşim.addAll(set5));
        System.out.println(birleşim);



    }
}
