package listleriSıralama;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Buyuktenkucugesırala implements Comparator<String>{

    @Override
    public int compare(String s, String t1) {
        return -s.compareTo(t1);// burada - yi kaldırınca küçükten sıralama yapar.

    }
}

class KucuktenBuyugePlayer implements Comparator<Player1>{

    @Override
    public int compare(Player1 player1, Player1 t1) {
        if(player1.getId()<t1.getId()){
            return -1;
        }
        else if(player1.getId()>t1.getId()){
            return  1;
        }return 0;
    }
}

class Player1 implements Comparable<Player1>{
    private String isim;

    private int id;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Player1(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "|||| ID: " + id + " İsim :" + isim + " |||";

    }

    @Override
    public int compareTo(Player1 player) {

        if (this.id < player.id) {

            return -1;

        }
        else if (this.id > player.id) {
            return 1;

        }
        return 0;



    }



}

class BuyuktenKucugePlayer implements Comparator<Player1>{

    @Override
    public int compare(Player1 player1, Player1 t1) {
        if(player1.getId()<t1.getId()){
            return 1;
        }
        else if(player1.getId()>t1.getId()){
            return  -1;
        }return 0;
    }
}

class KucuktenBuyugeString implements  Comparator<Player1>{

    @Override
    public int compare(Player1 player1, Player1 t1) {
        return player1.getIsim().compareTo(t1.getIsim());
    }
}


public class Main {
    public static void main(String[] args) {
       /* List<String> list_string = new ArrayList<String>();
        list_string.add("Ramazan");
        list_string.add("Ahmet");
        list_string.add("Demir");
        list_string.add("MErhaba");
        Collections.sort(list_string);//listedeki değerleri sıralamak için kulllanılıyor.
        for (String s: list_string){
            System.out.println(s);
        }*/
    List<Player1>list_player = new ArrayList<Player1>();
        list_player.add(new Player1("Ramazan",1));
        list_player.add(new Player1("Ahmet",5));
        list_player.add(new Player1("dimag",7));
       // Player1 p1 = new Player1("Ahmet",5);
      //  Player1 p2 = new Player1("Ramazan",1);
        //System.out.println(p1.compareTo(p2));// comporeTo karşılaştırma metodudur.
        Collections.sort(list_player,new BuyuktenKucugePlayer());//listedeki değerleri sıralamak için kulllanılıyor.



      for (Player1 s: list_player){
            System.out.println(s);}
        System.out.println("************"+" Aynaaa");
        Collections.sort(list_player, new KucuktenBuyugePlayer());
        for (Player1 s1: list_player){
            System.out.println(s1);}

       System.out.println("**************");
        Collections.sort(list_player, new KucuktenBuyugeString());// Burda da string değerlere göre küçükten sıralama
        for (Player1 s1: list_player){
            System.out.println(s1);}
        System.out.println("/////////////////////");
        Collections.sort(list_player, new Comparator<Player1>() {
            @Override
            public int compare(Player1 player1, Player1 t1) {
                return t1.getIsim().compareTo(player1.getIsim());// burada da buyukten küçüğe string sıralaması yaptık ve annonim class yazdık yani yukarıda tanımlamadan yazdık.
            }
        });
        for (Player1 p5:list_player){
            System.out.println(p5);
        }
        // sonuç olarak hem karşılaştırıp hemde sıraladık.
      /*  Set<Player1>treeset = new TreeSet<Player1>();// treeset compareTo gibi kendi içinde değerleri küçükten büyüğe sıralıyor.
        treeset.add(new Player1("Ramazan",1));
        treeset.add(new Player1("Ahmet",5));
        treeset.add(new Player1("dimag",6));*/

       /* List<String> list = new ArrayList<String>();


        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("Php");
        list.add("Go");

        Collections.sort(list,new Buyuktenkucugesırala());




        for (String s : list) {
            System.out.println(s);

        }*/
    }
}

