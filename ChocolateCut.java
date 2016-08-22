import java.util.Scanner;
public class ChocolateCut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a;
		int b;
		StringBuffer s1=new StringBuffer();
		for(int i=0;i<n;i++){
			a=s.nextInt();
			b=s.nextInt();
			int c=(a*b)-1;
			s1.append(c+" ");
			c=0;
		}
System.out.println(s1);
	}

}
