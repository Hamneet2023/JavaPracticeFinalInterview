package javaPractice;

import java.util.Scanner;

public class ArmstrongNumber {

	Scanner sc= new Scanner(System.in);
	public void armStrongNumber() {
		int sum=0;
		System.out.println("Enter a number:");
		int number =sc.nextInt();
		int originalNumber = number;
	
		while(number!=0) {
			
			int r =number%10;
			int remainder =r*r*r;
			System.out.println("sum in each iteration "+sum);
			int q=number/10;
			number=q;
			sum= sum+remainder;
			System.out.println(sum);
		}

		if(originalNumber==sum) {
			
			System.out.println("Number is Armstrong");
		}else {
			System.out.println("Number is not Armstrong");
		}
		
	}
	
	public static void main(String[] args) {
		
		ArmstrongNumber arm = new ArmstrongNumber();
		arm.armStrongNumber();
	}

}
