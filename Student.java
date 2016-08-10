import java.util.Scanner;	
	public class Student{
		public static void main(String args[]){
			int a;
			int b;
			int count=0;
			Scanner s=new Scanner(System.in);
			a=s.nextInt();
			b=2*a;
			for(int i=0;i<b;i++){
				for(int j=i+1;j<=b;j++){
					System.out.println(i+""+j);
				count++;
				}
			}
			System.out.println(count);
		}
	}

