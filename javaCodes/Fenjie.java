package first_project;

import java.util.Scanner;

public class Fenjie {
	//将一个数质因数分解
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入整数:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(n+"=");
		// n>=2才执行下面的循环
	    for(int i=2; i<=n; i++){
	        while(n!=i){
	            if(n%i==0){
	                System.out.print(i+"*");
	                n=n/i;
	            }else
	                break;
	        }
	    }
	    System.out.println(n);
	    sc.close();
	}

}
