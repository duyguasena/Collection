package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Alıştırma {
	
	/*İl İlçe Listesi
	 * Bir ilçe rehberi uygulaması yazın.Her ilin ilçelerini bir hashMap kullanarak saklayın.
	 * Kullanıcıdan bir il seçmesini ve o ilin ilçelerini isteyen bir program yazın.
	 */
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Map<String,String[]> ılçeler=new HashMap<>();
		
		ılçeler.put("Ankara",new String[] {"Çankaya","Etimesgut","Kızılay"});
		ılçeler.put("İstanbul", new String[] {"Beşiktas","Kadiköy","Uskudar"});
	
	
		System.out.println("Bir il seçiniz(Ankara veya İstanbul)");
		String secilenIl=scanner.nextLine();
		
		if(ılçeler.containsKey(secilenIl)) {
			String[] secilenIlceler=ılçeler.get(secilenIl);
			
			for(String ilçe:secilenIlceler) {
				System.out.println(ilçe);
			}
			
		}else {
			System.out.println("Seçtiğiniz il sistemde bulunmuyor.");
		}
	}
	
	
	
	
	
	
	
	

}
