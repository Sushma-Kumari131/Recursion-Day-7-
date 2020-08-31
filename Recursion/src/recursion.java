import java.util.Scanner;

public class recursion {

		//factorial
		public static int factorial(int n) {
			if (n==1)
				return 1;
			else
				return n*factorial(n-1);			
		}
		
		//fibonacci series
		public static int fibo(int n) {
			if(n==1)
				return 0;
			if(n==2||n==3)
				return 1;
			return fibo(n-1)+fibo(n-2);
		}
		
		
		//multiplication table
		public static void table(int n,int i) {
			if(i>10)
				return;
			
			System.out.println(n+" * "+i+ " = "+(n*i));
			table(n,++i);
		}
		
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=factorial(n);
			System.out.println("Factorial: "+fact);
		int fibonacci=fibo(n);
			System.out.print("Fibonacci series: ");
		for(int i=1;i<=n;i++)
			System.out.print(fibo(i)+" ");
		table(n,1);		
	
	}

}

