package hashMap;
// Map interface, HashMap, LinkedHAshMap vr TreeMAp Farkları

import java.util.*;

public class HAshMap2 {

    public static void main(String[] args) {
        Map<Integer,String> Hasmhap = new HashMap<Integer, String>();
        Map<Integer,String> LinkedHashmap = new LinkedHashMap<Integer, String>();
        Map<Integer,String> treeMap = new TreeMap<Integer, String>();
        System.out.println("********************************");
        mapYazdır(Hasmhap);
        System.out.println("--------------------------------");
        mapYazdır(LinkedHashmap);
        System.out.println("++++++++++++++++++++++++++++++++");
        mapYazdır(treeMap);// Tree MAp Treesete göre değerlere göre değil  key lere göre sıralama yapıyor.
    }
    public static  void mapYazdır(Map<Integer,String>map){
        map.put(1,"Ramazan");
        map.put(2,"Tunay");
        map.put(3,"Adıyaman");
        map.put(4,"Dimag");
      /*  for(Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println("Key :" + entry.getKey()+"Value :"+entry.getValue());

        }*/
      // yada yukarıdaki for döngüsünü daha farklı şekilde yazalım
        for (Integer key : map.keySet()){
            System.out.println("Key :"+key +"value"+ map.get(key));
            // burda da ykarı da ki for döngüsünü ile aynı sonuç alınır.
        }

        System.out.println("**************************");
        Collection<String> values = map.values();
        for(String s: map.values()){
            System.out.println("Değer :" + s);
        }
       /* System.out.println(map.keySet());// bu method ile de ahnatarları(keyleri) bastıra biliriz.
        System.out.println(map.values());// values ile de değerleri ekrana yazdırıyoruz.
        // values leri birde aşağıdaki gibi badtırabiliriz.


*/
    }
}
