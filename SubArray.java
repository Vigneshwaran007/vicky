import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		StringBuffer bf=new StringBuffer();
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			bf.append(a[i]);
		}
		String s1,s2;
		s1=bf.toString();
		System.out.println(s1);
		int num=s.nextInt();
		int b[]=new int[num];
		StringBuffer bf1=new StringBuffer();
		for(int i=0;i<num;i++){
			b[i]=s.nextInt();
			bf1.append(b[i]);
		}
		s2=bf1.toString();
		int count=0;
		
			if(s1.contains(s2)){
				count=1;
			}
		if(count==1){
			System.out.println("yes");
		}
		else
			System.out.println("no");
	}

}
