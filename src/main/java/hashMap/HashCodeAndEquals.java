package hashMap;

import java.util.HashSet;
import java.util.Set;

class Player implements Comparable<Player> {

    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "|||| ID: " + id + " İsim :" + isim + " |||";

    }

    @Override
    public int compareTo(Player player) {

        if (this.id < player.id) {

            return -1;

        } else if (this.id > player.id) {
            return 1;

        }
        return 0;


    }


    public static void main(String[] args) {
        Set<Player> hashSet = new HashSet<Player>();
        Player player1 = new Player("Ramazan",1);
        Player player2 = new Player("Ahmet",10);
        Player player3 = new Player("Erkam",9);
        Player player4 = new Player("Ramazan",1);
        hashSet.add(player1);
        hashSet.add(player2);
        hashSet.add(player3);
        hashSet.add(player4);
        // 2 tane aynı id ve isminde değer ekli lakin hash kod ve equals kodu tanımlar isek birini depolamaz.
        // hassh kod ve equalı generate den ekliyoruz

        for (Player p :hashSet ){
            System.out.println(p);

        }

    }
}
