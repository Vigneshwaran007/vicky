import java.util.Scanner;

public class ArrAvg {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		int len=a.length/2; 
		int b[]=new int[len];
		int c[]=new int[(a.length-len)];
		
			for(int i=0;i<len;i++){
				b[i]=a[i];
				System.out.print(b[i]);
				
			}
			int j=0;
			for(int i=len;i<a.length;i++){
				c[j]=a[i];
				
				System.out.println(c[j]);
				j++;
			}
			int d=0,e=0;
			for(int i=0;i<b.length;i++){
				d+=b[i];
			}
			for(int i=0;i<c.length;i++){
				e+=c[i];
			}
			if(d/b.length==e/c.length){
				System.out.println("possible");
			}
			else
				System.out.println("not possible");
		}
		// TODO Auto-generated method stub

	}
