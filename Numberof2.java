import java.util.Scanner;

public class Numberof2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		for(int i=0;i<=n;i++){
			if(i%10==2||i/10==2){
				count++;
			}
		}
		System.out.println(count);
	}

}
