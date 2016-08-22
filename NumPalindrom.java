import java.util.Scanner;
public class NumPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int b=Integer.parseInt(a);
		int sum=0;
		while(b>0){
			int temp=b%10;
			sum+=temp;
			b=b/10;
		}
		System.out.println(sum);
		String s=""+sum;
		System.out.println(s);
		StringBuffer s1=new StringBuffer(s);
		s1.reverse();
		System.out.println(s1);
		String s2=s1+"";
		System.out.println(s2);
		if(s.equals(s2)){
			System.out.println("palindrom");
		}
		else{
			System.out.println("not palindrom");
		}
	}

}
