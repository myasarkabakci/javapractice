package �devler02;

import java.util.Scanner;

public class Soru3_NestedIfStatement {

	public static void main(String[] args) {
		/*
		 * �NestedIfStatements� class olusturun.
		 * 
		 * Kullanicidan 2 kisi icin dogum gunu girmesini isteyin.
		 * 
		 * Y�l�, ayi ve g�n� tamsay� olarak al�n e NestedIf kullanarak kimin yas olarak
		 * daha buyuk oldugunu ekrana yazdirin. Examples: int birthYearOfYusuf=2000,
		 * birthMonthOfYusuf=12, birthDayOfYusuf=12, int
		 * birthYearOfMehmet=2000,birthMonthOfMehmet=12, birthDayOfMehmet=21; Yusuf is
		 * Older
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen 1. ki�i i�in bir ad giriniz");
		String ad1=scan.nextLine();
		System.out.println("L�tfen 2. ki�i i�in bir ad giriniz");
		String ad2=scan.nextLine();
		System.out.println(ad1+" l�tfen do�um y�l�n�z� giriniz");
		int dogumYil1=scan.nextInt();
		System.out.println(ad1+" l�tfen do�du�unuz ay� giriniz");
		int DogumAy1=scan.nextInt();
		System.out.println(ad1+" l�tfen do�du�unuz g�n� giriniz");
		int DogumGun1=scan.nextInt();

	
		System.out.println();
		System.out.println(ad2+" l�tfen do�um y�l�n�z� giriniz");
		int dogumYil2=scan.nextInt();
		System.out.println(ad2+" l�tfen do�du�unuz ay� giriniz");
		int DogumAy2=scan.nextInt();
		System.out.println(ad2+" l�tfen do�du�unuz g�n� giriniz");
		int DogumGun2=scan.nextInt();
		
		if (dogumYil1>dogumYil2) {
			System.out.println(ad2+" older "+ad1);
		}else if(dogumYil1==dogumYil2&&DogumAy1>DogumAy2) {
			System.out.println(ad2+" older "+ad1);
		}else if((dogumYil1==dogumYil2&&DogumAy1==DogumAy2&&DogumGun1>DogumGun2)) {
			System.out.println(ad2+" older "+ad1);
		}else {
			System.out.println(ad1+" older "+ad2);
		}
	scan.close();		
	}

}
