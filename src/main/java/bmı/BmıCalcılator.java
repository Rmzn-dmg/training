package bmı;
enum Cinsiyet {
    KADIN, ERKEK
}

public class BmıCalcılator {
    // class veriable
 public static final String OVERWEİGTH ="Overweigth";
 public static final String NORMAL = "normal";
 public static final String UNDERWEİGTH = "underweigth";
 public static final String OBESE ="obese";

 // instance veriable
    private Cinsiyet cinsiyet;

    public BmıCalcılator(Cinsiyet cinsiyet){this.cinsiyet = cinsiyet;}

    // instance method
    public String calculate (double boy, double kilo) throws Exception {
        if (boy <= 0 || boy > 3.0) {
            throw new Exception("Hatalı boy girdin!"+boy);
        }
        if (kilo <= 0 || kilo > 1000) {
            throw new Exception("Hatalı kilo girdin!"+kilo); }
            double bmı = BmıCalcılator.calculateBMI(this.cinsiyet, boy, kilo);
            return category(bmı);
           }
    private static String category(double bmı) {
        String  category = null;
        if(bmı<1.85){
            category = UNDERWEİGTH;
        }else  if (bmı>1.85 && bmı<24.9){
            category =NORMAL;

        }else if(bmı>24.9 && bmı<29){
            category = OVERWEİGTH;
        }
        else {
            category =OBESE;
        }return category;
    }



    private static double calculateBMI(Cinsiyet cinsiyet, double boy, double kilo) {
       double factor =1;
       if(cinsiyet ==Cinsiyet.KADIN){
           factor=1.25;

       }
        return  (factor*kilo)/ (boy*boy);

    }



    public static void main(String[] args) throws Exception {
        BmıCalcılator erkek = new BmıCalcılator(Cinsiyet.ERKEK);
        //For men
        System.out.println(erkek.calculate(1.84,84));
        System.out.println(erkek.calculate(1.85,55));
        System.out.println(erkek.calculate(1.69,75));
        System.out.println(erkek.calculate(1.70,100));

        // For women
        BmıCalcılator kadın = new BmıCalcılator(Cinsiyet.KADIN);
        System.out.println(erkek.calculate(1.60,84));
        System.out.println(erkek.calculate(1.65,77));
        System.out.println(erkek.calculate(1.70,56));
    }


}
