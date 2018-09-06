package first_project;

public class shuixianhua {
	//打印水仙花数
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=100;i<=999;i++){
			int a=i%10; //个位
			int b=i/10%10;//十位
			int c=i/100%10;//百位
			if(i==(a*a*a)+(b*b*b)+(c*c*c))
				System.out.println(i);
		}
	}

}
