import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican;
        Scanner input = new Scanner(System.in);
        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlican = 5.00;

        System.out.println("Armut kaç kilo");
        double kilo=input.nextDouble();
        double Armut_tutar = kilo*armut;

        System.out.println("elma kaç kilo");
        kilo=input.nextDouble();
        double elma_tutar = kilo*elma;

        System.out.println("domates kaç kilo");
         kilo=input.nextDouble();
         double domates_tutar=kilo*domates;

        System.out.println("muz kaç kilo");
        kilo=input.nextDouble();
        double muz_tutar = kilo*muz;

        System.out.println("patlican kaç kilo");
        kilo=input.nextDouble();
        double patlican_tutar = patlican*kilo;

        double total = Armut_tutar+elma_tutar+domates_tutar+muz_tutar+patlican_tutar;
        System.out.println(total);
    }
}
