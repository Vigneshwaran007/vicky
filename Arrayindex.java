import java.util.Arrays;
import java.util.Scanner;	
	public class Arrayindex{
		public static void main(String args[]){
			int a;
			Scanner s=new Scanner(System.in);
			a=s.nextInt();
			int array[]=new int[a];
			for(int i=0;i<a;i++){
				array[i]=s.nextInt();
			}
			for(int i=0;i<a;i++){
				if(array[i]==i){
					System.out.println("number "+array[i]+"index is"+i);
				}
			}
		}
	}
