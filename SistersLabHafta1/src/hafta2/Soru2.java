package hafta2;

import java.util.Scanner;

public class Soru2 {
	
	 //Palindrom kontrolü yapan metod:
	
	
	static String newWord="";
	@SuppressWarnings("unused")
	public static  boolean isPalindrom(String word) {
		
		for (int i=word.length()-1;i>=0;i--) {
			newWord+=word.charAt(i);
			return true;
		}
		return true;
		
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Kelime giriniz");
		String word=input.next();
		
		if (isPalindrom(word)) {
            System.out.println(word + " bir palindromdur.");
        } else {
            System.out.println(word + " bir palindrom değildir.");
        }
		
		
		

	}

}
