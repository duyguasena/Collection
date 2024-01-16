package hafta2;

import java.util.Scanner;

public class Soru6 {
	//Ebob ve Ekok bulma

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Lütfen birinci sayıyı giriniz: ");
		int number1=input.nextInt();
		
		System.out.println("Lütfen ikinci sayıyı giriniz: ");
		int number2=input.nextInt();
		
		
		int n=Math.min(number1, number2);
		int ebob=1;
		
		for(int i=1;i<=n;i++) {
			if ((number1%i==0)&&(number2%i==0)){
				ebob=i;
				
			}
			
		}
		
		int ekok=(number1*number2)/ebob;
		System.out.println("Girilen sayıların ebob değeri"+ebob);
		System.out.println("Girilen sayıların ekok değeri:"+ekok);
		
		
		

	}

}
