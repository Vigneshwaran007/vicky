import java.util.Arrays;
import java.util.Scanner;	
	public class Arraysort {
		public static void main(String args[]){
			Scanner s=new Scanner(System.in);
			int a,b;
			a=s.nextInt();
			int a1[]=new int[a];
			for(int i=0;i<a;i++){
				a1[i]=s.nextInt();
			}
			int j=s.nextInt();
			Arrays.sort(a1);
			for(int i=0;i<a-j;i++){
				System.out.println(a1[i]);
			}
		}
	}
