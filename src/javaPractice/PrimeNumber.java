package javaPractice;

public class PrimeNumber {

	public static void main(String[] args) {
		int i;
		int n = 7;
		for (i = 2; i <=n - 1; i++) {
			if(n%i==0) {
				break;
			}
		}
		if (n == i) {
			System.out.println("loop complete their cycle gib=ven number is prime");
		} else {
			System.out.println("given number is not a prime number:");
		}
	}
}
