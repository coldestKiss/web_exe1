package web_use;


public class Fibonacci {
	private static int of(int n) {
		int a=0,b=1,c=1;
		for(;n>0;n--) {
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}
	
	public static void main(String[] args) {
		int fb = 0;
		int n=0;
		   while(fb<200) {
			   fb=Fibonacci.of(n);
			   if(fb<200) {
				   System.out.println(fb);
			   }
			   n++;
		   }
		}
}
