import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		String s1;
		s1=s.next();
		StringBuffer bf=new StringBuffer(s1);
		char[] c=s1.toCharArray();
		for(int i=0;i<s1.length();i++){
			for(int j=i+1;j<s1.length();j++)
			if(c[i]==c[j]){
				bf.deleteCharAt(j);
			}
		}
		System.out.println(bf);

	}

}
