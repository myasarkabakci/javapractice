package ödevler01;
import java.util.Scanner;

public class GirilenBirSayýnýnTersi {

	public static void main(String[] args) {
		//**3- girilen bir sayýnýn basamaklarýna göre tersi olan sayýyý bulunuz.
        Scanner scan= new Scanner(System.in);
        System.out.println("bir sayý gir");
        int sayi= scan.nextInt();

        int tersi=0;

        while (sayi>0) {
            int birlerb = sayi % 10;
            tersi = tersi * 10 + birlerb;
            sayi = sayi / 10; }
        System.out.println("tersi = " + tersi);
	scan.close();
	}

}
