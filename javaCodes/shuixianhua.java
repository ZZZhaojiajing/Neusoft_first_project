package first_project;

public class shuixianhua {
	//��ӡˮ�ɻ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=100;i<=999;i++){
			int a=i%10; //��λ
			int b=i/10%10;//ʮλ
			int c=i/100%10;//��λ
			if(i==(a*a*a)+(b*b*b)+(c*c*c))
				System.out.println(i);
		}
	}

}
