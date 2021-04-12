package ödevler02;

import java.util.Scanner;

public class Soru3_NestedIfStatement {

	public static void main(String[] args) {
		/*
		 * “NestedIfStatements” class olusturun.
		 * 
		 * Kullanicidan 2 kisi icin dogum gunu girmesini isteyin.
		 * 
		 * Yýlý, ayi ve günü tamsayý olarak alýn e NestedIf kullanarak kimin yas olarak
		 * daha buyuk oldugunu ekrana yazdirin. Examples: int birthYearOfYusuf=2000,
		 * birthMonthOfYusuf=12, birthDayOfYusuf=12, int
		 * birthYearOfMehmet=2000,birthMonthOfMehmet=12, birthDayOfMehmet=21; Yusuf is
		 * Older
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 1. kiþi için bir ad giriniz");
		String ad1=scan.nextLine();
		System.out.println("Lütfen 2. kiþi için bir ad giriniz");
		String ad2=scan.nextLine();
		System.out.println(ad1+" lütfen doðum yýlýnýzý giriniz");
		int dogumYil1=scan.nextInt();
		System.out.println(ad1+" lütfen doðduðunuz ayý giriniz");
		int DogumAy1=scan.nextInt();
		System.out.println(ad1+" lütfen doðduðunuz günü giriniz");
		int DogumGun1=scan.nextInt();

	
		System.out.println();
		System.out.println(ad2+" lütfen doðum yýlýnýzý giriniz");
		int dogumYil2=scan.nextInt();
		System.out.println(ad2+" lütfen doðduðunuz ayý giriniz");
		int DogumAy2=scan.nextInt();
		System.out.println(ad2+" lütfen doðduðunuz günü giriniz");
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
