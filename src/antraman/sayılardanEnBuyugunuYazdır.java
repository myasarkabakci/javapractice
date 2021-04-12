package antraman;

public class sayýlardanEnBuyugunuYazdýr {

	public static void main(String[] args) {
		int arr[]= {5,8,94,6,3,2,7,9};
		System.out.println(buyukSayiBul(arr));
		System.out.println(kucukSayiBul(arr));
	}

	private static int buyukSayiBul(int[] arr) {
		int buyukSayi=Integer.MIN_VALUE;
		for (int i : arr) {
			if(buyukSayi<i) buyukSayi=i;	
			}	
	return buyukSayi;	
	}private static int kucukSayiBul(int[] arr) {
		int kucukSayi=Integer.MAX_VALUE;
		for (int i : arr) {
			if(kucukSayi>i) kucukSayi=i;	
			}	
	return kucukSayi;	
	}
}