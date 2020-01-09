package hashMap;

import java.util.HashMap;
import java.util.Map;


public class HashMapMAin {
    /* HashMap Sınıfı;
    1-Değerleri Key(Anahtar) ve Value(Değer) olarak depolar. Her Key'e karşılık gelen bir değer vardır.
    2- Bir anahtar 1 kez varolabilir ancak birden fazla değer olabilir.
    3-Elemantleri tıpkı HashSet gibi ekleme sırasına göre depolamaz.

     */
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(1,"Ramazan");// burda ekleme kodu add değilde put kullanılır.
        hashMap.put(2,"Tunay");
        hashMap.put(3,"Dimag");
        System.out.println(hashMap);
        System.out.println(hashMap.get(1)+" "+hashMap.get(2)+" "+hashMap.get(3));// get fonksiyonu ile hasmaptaki keyi yazıp  değeeri çekeiyoruz
        //HashMap te ekrna for ile yazdırmak daha farklı
        // yani hashmapi önce entrysete dönüştürerek yazmamız gerekiyor.
        for (Map.Entry<Integer,String> entry:hashMap.entrySet()){
            System.out.println("Anahatar"+entry.getKey()+"-----> değer:"+ entry.getValue());

        }
    }
}
