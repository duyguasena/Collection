
package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
//		Soru: Satis Takibi
//
//		Bir sirketin satislarini takip eden bir program yazin.
//		Her musterinin adini anahtar, satis miktarini deger olarak iceren bir HashMap kullanin. 
//		Toplam satis miktarini hesaplayarak en cok satis yapan musteriyi bulan bir program yazin.
		 Scanner scanner = new Scanner(System.in);
		 Map<String, Integer> musteriSatislari = new HashMap<>();
	     
	     
	     
	     while(true) {
	    	System.out.print("Musteri adini girin:(Çıkmak için exit yazin ");
	        String musteriAdi = scanner.nextLine();
	        
	        if (musteriAdi.equals("exit")) {
	        	System.out.println("Urun listesi sonlandırılıyor");
	        	break;
				
			}
	        System.out.print("Satis miktarini girin: ");
	        int satisMiktari = scanner.nextInt();
	        
	        musteriSatislari.put(musteriAdi, satisMiktari);
	        
	        for(Map.Entry<String, Integer> entry:musteriSatislari.entrySet()) {
	        	System.out.println(entry.getKey()+ entry.getValue());
	        }
	        
	        

	       
	     }
	}

}
