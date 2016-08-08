import java.util.Arrays;
import java.util.Scanner;	
	public class Prime1{
		public static void main(String args[]){
			Scanner s=new Scanner(System.in);
			int a,b[];
			
			for(int i=0;i<5;i++){
				a=s.nextInt();
			}
			for(int i=0;i<5;i++){
				if(b[i]<100){
					char []ch=String.valueOf(b[i]).toCharArray();
					System.out.println(ch[i]+""+ch[i+1]);
				}
			}
		}
	}
