package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Soru1 {

	public static void main(String[] args) {
//		Soru: Ogrenci Notlari
//
//		Bir ogrenci not takip sistemi yazin. Her ogrencinin adini anahtar, notunu deger olarak iceren bir HashMap kullanarak,
//		kullaniciya ogrenci eklemesini ve bir ogrencinin notunu sorgulamasini saglayan bir program yapin.

		Scanner scanner=new Scanner(System.in);
		HashMap<String, Integer> notHashMap=new HashMap<>();
		
		while(true) {
			System.out.println("Ogrenci adini girin");
			String ad=scanner.next();
			
			if (ad.equals("exit")) {
				System.out.println("************************");
				System.out.println("Oğrenci listesi sonlandiriliyor");
				break;
			}
			
			System.out.println("Notu giriniz");
			int not=scanner.nextInt();
			scanner.nextLine();
			
			notHashMap.put(ad, not);
			
			System.out.println("************************");
			System.out.println("Not listesi");
			
			for(Map.Entry<String, Integer> entry:notHashMap.entrySet()) {
				System.out.println(entry.getKey()+" : "+ entry.getValue());
			}	
			
		}	
			
			
		}
		}


