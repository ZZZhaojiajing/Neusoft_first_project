package first_project;

import java.util.Scanner;

public class Fenjie {
	//��һ�����������ֽ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��������:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(n+"=");
		// n>=2��ִ�������ѭ��
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
