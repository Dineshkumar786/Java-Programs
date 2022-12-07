package examples.java;
import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
//		int a=150,b=200,c=90;
//		
//		if(a> b && a > c) {
//			System.out.println("the greater is "+a);
//		}
//		else if(b > c && b > a) {
//			System.out.println("the greater is "+b);
//		}else {
//			System.out.println("the greater is "+c);
//		}
		
		
//		int a=60,b=59, c=10;
//		int max =a;
//		if(b > max) {
//			max = b;
//		}if(c > max) {
//			max = c;
//		}
//		System.out.println(max);
		
		
//		Scanner in  = new Scanner(System.in);
//		
//		System.out.println("Enter the 3 numbers: ");
//		int a = in.nextInt();
//		int b = in.nextInt();
//		int c = in.nextInt();
//		
//		int max = a;
//		if(b > max) {
//			max = b;
//		}
//		if(c > max) {
//			max =c;
//		}		
//		System.out.println("the greatest between three numbers is "+max);
		
		
		
//		Scanner  in = new Scanner(System.in);
//		char ch =in.next().trim().charAt(0);
//		
//		if(ch >='a' && ch <='z') {
//			System.out.println("Lowercase");
//		}else {
//			System.out.println("uppercase");
//		}		
		
		
//	    // fibonacci number
//		int a=0,b=1,c ,count=10;
//	    System.out.println(a+""+b);
//	    for(int i=2;i<=count;i++) {
//	    	c = a + b;
//	    	System.out.println(c);
//	    	a = b;
//	    	b = c;
//	    }
	    
	    
		
	    // find the fibonaaci number
//	    Scanner sc = new Scanner(System.in);
//	    int n = sc.nextInt();
//	    
//	    int n1=0;
//	    int n2=1;
//	    int count=2;
//	    
//	    while(count <=n) {
//	    	int temp = n2;
//	    	n2 = n2 + n1;
//	    	n1 = temp;
//	    	count++;
//	    }
//	    System.out.println(n2);
//	    
	    
		
		// Counting occurances
		
//		int n = 2343533;
//		int count=0;
//		while(n > 0) {
//			int remainder = n % 10;
//			if(remainder ==3) {
//				count++;
//			}
//			n = n / 10;
//		}
//		System.out.println(count);
		
		
		
		
		// Reverse a number
		int num =  23597;
		int ans = 0;
		while(num > 0 ) {
			int rem = num % 10;
			num = num / 10;
			
			ans = ans * 10 + rem;
		}
		System.out.println(ans);
		
			
			
		
		
		
	
		
		

	}

}
