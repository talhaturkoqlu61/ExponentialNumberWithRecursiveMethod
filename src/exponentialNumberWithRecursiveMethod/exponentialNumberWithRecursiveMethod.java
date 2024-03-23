package exponentialNumberWithRecursiveMethod;
import java.util.Scanner;



public class exponentialNumberWithRecursiveMethod {
	static int expo(int base,int exponent) {
		if(exponent!=0) {
			return expo(base,exponent-1)*base;
		}
		else {
			return 1;
		}
		
			
		}


	
	
	
	
	public static void main(String[]args) {
		 int base, exponent;
		 Scanner input=new Scanner(System.in);
		 System.out.print("Please enter a number for base of the number which will be created: ");
		 base=input.nextInt();
		 System.out.print("Please enter a number for power of the number which will be created: ");
		 exponent=input.nextInt();
		 System.out.println(expo(base,exponent));
		 
		 
		 
		
		
	}

}
