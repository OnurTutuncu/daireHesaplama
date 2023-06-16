import java.util.Scanner;

public class daireHesaplama {
    public static void main(String[] args){

    int r;
    double pi = 3.14;

    Scanner inp = new Scanner(System.in);
    System.out.print("Ekrana Dairenin Yarıçapını Giriniz:");
    r =inp.nextInt();

    double cevre = 2 * pi * r;
    double alan = pi * (r * r);

        System.out.println("Dairenin Çevresi :"+ cevre);
        System.out.println("Dairenin Alanı :"+ alan);

}
}




