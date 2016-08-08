import java.util.Scanner;	
	public class Pangram{
		public static void main(String args[]){
			int a=26;
			Scanner s=new Scanner(System.in);
			String str=s.next();
			if(a>0){
			if(str.length()<a){
				System.out.println("not pangram");
			}
			for(char c='A';c<='Z';c++){
				if((str.indexOf(c)<0)&&str.indexOf((char)(c+32))<0){
					System.out.println("not pangram");
				}
			}
			}
			else
				System.out.println("pangrm");
		}
	}

