package iterable;
// Itareble dan Radyo sınıfını implement etmez isek MAin jaza da kanals listesini foreache ile yazamayız
// NEdeni : forache zaten normalde listeyi itarable ye dönüştürdüğü için


import java.util.ArrayList;
import java.util.Iterator;

public class Radyo implements Iterable <String> {
    private ArrayList<String > kanallar_listesi = new ArrayList<String >();
    public  class RadyoIterator implements Iterator<String>{
        private  int index=0;

        @Override
        public boolean hasNext() {
            if(index<kanallar_listesi.size()){
                return true;
            }
            else {
                return false;

            }
        }

        @Override
        public String next() {
            String deger = kanallar_listesi.get(index);
            index++;
            return deger;
        }
    }

    public Radyo(String [] kanallar){
         for (String kanal:kanallar){
             kanallar_listesi.add(kanal);
         }
    }

    @Override
    public Iterator <String > iterator() {

        //return kanallar_listesi.iterator();
        return new RadyoIterator();
    }

}
