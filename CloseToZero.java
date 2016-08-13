import java.util.Arrays;
import java.util.Scanner;

public class CloseToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		int sum[]=new int[n];
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				Math.abs(sum[i]=a[i]+a[j]);
			}
		}
		Arrays.sort(sum);
		System.out.println(sum[0]);
		

	}
