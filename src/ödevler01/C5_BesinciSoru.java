package �devler01;

import java.util.Scanner;

public class C5_BesinciSoru {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir kelime girmesini isteyin. S�zc�kte tek say�da karakter ve 3
		 * veya daha fazla karakter i�eriyorsa, kelimenin ortas�ndaki karakteri
		 * yazd�r�n.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir kelime giriniz");
		String kelime=scan.next();
		
		
		if (kelime.length()%2==0) {
			System.out.println("Girdi�iniz kelime �ift say�da karakter i�ermektedir");
		} else {
			System.out.println(kelime.substring(kelime.length()/2, kelime.length()/2+1));
		}
		
		scan.close();
		
	}

}
