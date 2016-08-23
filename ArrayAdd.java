import java.util.Scanner;

public class ArrayAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		System.out.println("enter target");
		int t=s.nextInt();
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
			if((a[i]+a[j])==t){
				System.out.println(a[i]+" "+a[j]);
			}
		}	
		}
	}

}
