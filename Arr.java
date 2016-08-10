import java.util.Arrays;
import java.util.Scanner;	
	public class Arr{
		public static void main(String args[]){
			Scanner s=new Scanner(System.in);
			int num=s.nextInt();
			int a[]=new int[num];
			int b[]=new int[num];
			for(int i=0;i<num;i++){
				a[i]=s.nextInt();
				b[i]=Integer.bitCount(a[i]);
			}
			for(int i=0;i<num-1;i++){
				for(int j=i+1;j<num;j++){
					if(a[i]<a[j]){
						int t=a[i];
						a[i]=a[j];
						a[j]=t;
						t=b[i];
						b[i]=b[j];
						b[j]=t;
					}
				}
			}
			for(int i=0;i<num-1;i++){
				for(int j=i+1;j<num;j++){
					if(b[i]<b[j]){
						int t=a[i];
						a[i]=a[j];
						a[j]=t;
						t=b[i];
						b[i]=b[j];
						b[j]=t;
					}
				}
			}
			for(int i=0;i<num;i++){
				System.out.println(a[i]);
			}
			
		}
	}

