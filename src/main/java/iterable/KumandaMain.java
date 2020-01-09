package iterable;

import java.util.Scanner;

public class KumandaMain{
    public static void main(String[] args) {
        System.out.println("Kumanda Programı");
        Scanner scanner = new Scanner(System.in);
        String islemler = "İşlemler......\n"
                +"1. Kanalları Göster \n"
                +"2. Kanal Ekle \n"
                +"3.Knal Sil  \n"
                +"4.Kanal Sayısı Öğre \n"
                +"Çıkış için q ya basın";
        Kumanda kumanda = new Kumanda();

        while(true){
            System.out.println(islemler);
            System.out.println("İşlemi Girniz:");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Sistemden çıkılıyor..");
                break;
            }
            else if (islem.equals("1")){
                kanallarıGöster(kumanda);

            }
            else if (islem.equals("2")){
                System.out.println("Eklenecek kanal :");
                String kanal_ismi = scanner.nextLine();
                kumanda.kanalEkle(kanal_ismi);

            } else if (islem.equals("3")){
                System.out.println("Silenecek kanal :");
                String kanal_ismi = scanner.nextLine();

            }  else if (islem.equals("4")){
                System.out.println("Kanal Sayısı : " + kumanda.kanalSayısı());

            }
            else {
                System.out.println("Yanlış işlem...!");
            }
        }
    }
    public  static void kanallarıGöster(Kumanda kumanda){
        if( kumanda.kanalSayısı()==0){
            System.out.println("Gösterilecek kanal yok:.");

        }
        else {
            for (String kanal : kumanda){
                System.out.println("Kanllar: " + kanal);
            }
        }

    }
}
