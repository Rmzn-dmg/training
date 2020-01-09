package hashMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// bir cümlede ki harf frekansını bulma
public class MapMAin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle gir:");
        String cumle= scanner.nextLine();
        Map<Character,Integer> frekans = new TreeMap<Character, Integer>();
        for(int i =0; i<cumle.length();i++){
            char c= cumle.charAt(i);
            if(frekans.containsKey(c)){
                frekans.replace(c,frekans.get(c)+1);//frekans.get(c) o an ki karekterin değerini alıyoruz ve 1 artırıyoruz
            }
            else {
                frekans.put(c,1);
            }

        }/*
        for (Map.Entry<Character, Integer> entry:frekans.entrySet()){
             System.out.println("Karekter :"+entry.getKey()+entry.getValue()+"Kadar Geçiyor..");

        }*/
        for (Character key : frekans.keySet()){
            System.out.println("Key : " +  key + "value"+  + frekans.get(key));
            // burda da ykarı da ki for döngüsünü ile aynı sonuç alınır.
        }
    }
}
