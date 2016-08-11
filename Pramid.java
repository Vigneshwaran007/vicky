import java.util.Scanner;

public class Pramid {
public static void main(String[] args) {
	int n;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	for(int i=0;i<=n;i++){
		for(int k=i;k<=n;k++){
			System.out.print(" ");
		}
		for(int j=1;j<((2+i)-1);j++){
		
			System.out.print(" "+j);
		
	}
		System.out.println(" ");
	}
	}
}

