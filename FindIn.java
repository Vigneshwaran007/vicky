import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FindIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		
		for(int i=0;i<n;i++){
			if(i==a[i]){
				System.out.println(a[i]);
			}
		}
		

	}
