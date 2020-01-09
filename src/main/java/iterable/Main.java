package iterable;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        String [] kanals ={"ALem FM","Radyo Kral","Radyo Sevim","RADYO DİMAG"};
        Radyo radyo = new Radyo(kanals);
       /* for(String s : radyo){
            System.out.println(s);
        }*/
        Iterator<String> ıterator = radyo.iterator();
        while (ıterator.hasNext()){
            System.out.println(ıterator.next());
        }
    }
}
