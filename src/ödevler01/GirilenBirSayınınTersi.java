package �devler01;
import java.util.Scanner;

public class GirilenBirSay�n�nTersi {

	public static void main(String[] args) {
		//**3- girilen bir say�n�n basamaklar�na g�re tersi olan say�y� bulunuz.
        Scanner scan= new Scanner(System.in);
        System.out.println("bir say� gir");
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
