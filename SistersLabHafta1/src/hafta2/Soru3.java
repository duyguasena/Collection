package hafta2;

import java.util.function.LongFunction;

public class Soru3 {
	// P(n,r)=n!/(n-r)!
	
	public static long faktoriyel(int sayi) {
		if(sayi<0||sayi>20) {
			return -1;
		}
		long sonuc=1;
		for(int i=0;i<sayi;i++) {
			sonuc*=i+1;
		}
		return sonuc;
	}
	
	public static long permutasyon(int n,int r) {
		return faktoriyel(n)/faktoriyel(n-r);
	}
	
	public static void main(String[] args) {
		System.out.println(permutasyon(5, 2));
	}

}
