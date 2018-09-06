package first_project;

import java.util.Scanner;

public class FibonacciSequence {
	//斐波那契数列
	public static int f(int n){
		if(n==1||n==2)
			return 1;
		else
			return f(n-1)+f(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("输入数列下标");
		int a=sc.nextInt();
		System.out.println(f(a));
		sc.close();
	}

}
