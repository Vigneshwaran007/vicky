import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> l=new LinkedList<Character>();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++){
		char c = s.next().charAt(0);
		l.add(c);
		}
		List<Character> l1=new LinkedList<Character>(l);
		Collections.reverse(l1);
		if(l1.equals(l)){
			System.out.println("palindrom");
		}
		else
			System.out.println("not palindrom");
	}

}
