import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdefghijklmnopqrstuvwxyz";
		Scanner s1=new Scanner(System.in);
		String s2=s1.nextLine();
		char[] c=s.toCharArray();
		int a=0;
		for(int i=0;i<s.length();i++){
			if(!s2.contains(c[i]+"")){
				a=1;
				break;
			}
		}
		System.out.println(a);
		if(a==1){
			System.out.println("not pangram");
		}
		else
			System.out.println("pangram");

	}

}
