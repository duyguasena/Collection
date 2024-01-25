package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Soru2 {

	public static void main(String[] args) {
//		Soru: Cift Sayilari Filtreleme
//
//		Bir ArrayList icinde rastgele sayilari saklayin.
//		Cift sayilari bir HashSet icine ekleyip, tek sayilari bir ArrayList icine ekleyen bir program yazin.

		
			ArrayList<Integer> sayilarListesi = new ArrayList<>();
	        HashSet<Integer> ciftSayilarSet = new HashSet<>();
	        ArrayList<Integer> tekSayilarListesi = new ArrayList<>();

	        // Rastgele sayılar ekleyelim
	        Random random = new Random();
	        for (int i = 0; i < 10; i++) {
	            int rastgeleSayi = random.nextInt(100); // 0 ile 99 arasında rastgele bir sayı
	            sayilarListesi.add(rastgeleSayi);
	        }

	        // Sayıları ekrana yazdıralım
	        System.out.println("Rastgele Sayılar: " + sayilarListesi);

	        // Cift ve tek sayilari ayiralim
	        for (int sayi : sayilarListesi) {
	            if (sayi % 2 == 0) {
	                ciftSayilarSet.add(sayi);
	            } else {
	                tekSayilarListesi.add(sayi);
	            }
	        }

	        // Cift sayilari ve tek sayilari ekrana yazdıralım
	        System.out.println("Çift Sayılar: " + ciftSayilarSet);
	        System.out.println("Tek Sayılar: " + tekSayilarListesi);
	    }
	}


