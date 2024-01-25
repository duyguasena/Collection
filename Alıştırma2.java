package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Alıştırma2 {

	public static void main(String[] args) {
		/*
		 * Urun Listesi
		 * Bir mağaza uygulaması yazın.Her ürünün adını ve fiyatını içeren bir HashMap kullanarak,
		 * kullanıcıya ürün eklemesinin ve her urun eklendikten sonra ekrana urun listesini yazdırın.
		 */
		
		
		Scanner scanner=new Scanner(System.in);
		Map<String, Double> productPrice=new HashMap<>();
		
		while (true) {
			System.out.println("Eklemek istediginiz urunun adini giriniz:(Cikmak icin exit yazin)");
			String productName=scanner.nextLine();
			
			if (productName.equals("exit")) {
				System.out.println("************************");
				System.out.println("Urun listesi sonlandırılıyor");
				break;
			}
			System.out.println("Urunun fiyatini giriniz");
			double price=scanner.nextDouble();
			scanner.nextLine();
			
			productPrice.put(productName, price);
			
			System.out.println("************************");
			System.out.println("Urun listesi");
			
			for(Map.Entry<String, Double> entry:productPrice.entrySet()) {
				System.out.println(entry.getKey()+" : "+ entry.getValue());
			}	
			
		}
		

	}

}
