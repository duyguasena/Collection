package hafta5;

public class ReverseInteger {
	
	public static int reverse(int x) {

        int reversed=0;
        int lastDigit=0;
        while(x!=0){
            lastDigit=x%10;
            reversed=reversed*10+lastDigit;
            x/=10;
            if (reversed>Integer.MAX_VALUE||reversed<Integer.MIN_VALUE) {
				return 0;
			}
           
        }
        return reversed;
     }
     public static void main(String[] args){
         System.out.println(reverse(123));
     }

	

}
