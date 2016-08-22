import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.List;
import java.util.Collections;
 import java.util.LinkedList;

public class Tallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
		int hight;
		Scanner s=new Scanner(System.in);
		for(int i=0;i<50;i++){
			hight=s.nextInt();
			tm.put(hight,i);
		}
		Set<Integer> st=tm.keySet();
		List<Integer> l=new LinkedList<Integer>(st);
		Collections.reverse(l);
		System.out.println(tm);
		System.out.println(l.get(3));
		int k=s.nextInt();
		System.out.println(l.get(k));	
	}

}
