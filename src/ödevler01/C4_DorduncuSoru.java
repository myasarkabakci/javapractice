package ödevler01;

import java.util.Scanner;

public class C4_DorduncuSoru {

	public static void main(String[] args) {
		/*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise “name1 cift sayili olmadigi icin ortasina yerlestiremedik” yazdirin.
		          e.g:
		          name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 1. ismi giriniz");
		String isim1=scan.nextLine();
		System.out.println("Lütfen 2. ismi giriniz");
		String isim2=scan.nextLine();
		
		if(isim1.length()%2==0) {
			System.out.println(isim1.substring(0, isim1.length()/2)+isim2+isim1.substring(isim1.length()/2,isim1.length()));
		}else {
			System.out.println("name1 çift sayili olmadiði icin ortasina yerlestiremedik");
		}
		
		scan.close();

	}

}
