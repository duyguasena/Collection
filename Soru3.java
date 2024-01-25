package model;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {
//		Soru: Oyuncu Puanlari
//
//		Bir oyuncu puan sistemini simule eden bir program yazin.
//		Oyuncularin isimlerini anahtar, puanlarini deger olarak kullanarak bir HashMap icinde saklayin.
//		Oyunculara puan eklemek ve puanlarini goruntulemek gibi islemleri gerceklestiren bir program yazin.
		
		Scanner scanner=new Scanner(System.in);
		HashMap<String, Integer> hashMap=new HashMap<>();
		
		while(true) {
			System.out.println("Oyuncu adini girin");
			String ad=scanner.next();
			
			if (ad.equals("exit")) {
				System.out.println("************************");
				System.out.println("Oğrenci listesi sonlandiriliyor");
				break;
			}
			
			System.out.println("Puan giriniz");
			int not=scanner.nextInt();
			scanner.nextLine();
			
			hashMap.put(ad, not);
			
			System.out.println("************************");
			System.out.println("Puan listesi");
			
			for(Map.Entry<String, Integer> entry:hashMap.entrySet()) {
				System.out.println(entry.getKey()+" : "+ entry.getValue());
			}	
			
		}	
		
		
	}

}
