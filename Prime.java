import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		String p="";
		for(int i=1;i<=a;i++){
			int c=0;
			for(int j=i;j>=1;j--){
				if(i%j==0){
					c=c+1;
				}
			}
			if(c==2){
				p=p+i+"";
			}
			
		}
		char[] c1=p.toCharArray();
		int[] a1=new int[p.length()];
		for(int i=0;i<p.length();i++){
			a1[i]=c1[i]-48;
			System.out.println(a1[i]);
		}
		int c=0;
		for(int i=0;i<a1.length-1;i++){
			for(int j=i+1;j<a1.length;j++){
				c=a1[i]+a1[j];
				if(c==a){
					System.out.println(a1[i]+""+a1[j]);
				}
			}
		}

	}

}
 
