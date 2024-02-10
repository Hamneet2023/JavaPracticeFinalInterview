package javaPractice;

public class FabbonaciSeries {

	public static void main(String[] args) {
	int a =-1;
	int b=1;
	int c=0;
	int n=5;
	while(c<n) {
	c=a+b;
	System.out.println("print fabonacci series:"+c);
	a=b;
	b=c;
	}
	
	
	}
	FabbonaciSeries  series = new FabbonaciSeries();
}
