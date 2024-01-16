package hafta1;

import java.util.Scanner;



public class Soru1 {

	public static void main(String[] args) {
		
		//Kdv li tutarı hesaplayan program
		
		double kdvTutar=0.30;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Para degerini giriniz:");    //10 olarak girin
		double para=scanner.nextInt();
		double kdvliFiyat= para+(para*kdvTutar);
		System.out.println(kdvliFiyat);

	}

}
