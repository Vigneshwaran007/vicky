import java.util.Scanner;	
	public class Seedno{
		public static void main(String args[]){
			Scanner s=new Scanner(System.in);
			int a,b;
			a=s.nextInt();
			int temp=a;
			int seed=a;
			int sum=0;
			while(temp>0){
				seed=seed*(temp%10);
				sum=sum+(temp%10);
				temp=temp/10;
			}
			a=a*sum;
			if(a==seed){
				System.out.println(a/sum);
				
			}
			else
				System.out.println(a/sum);
		}
	}

