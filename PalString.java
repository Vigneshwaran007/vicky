import java.util.Scanner;

public class PalString {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		String s;
		System.out.println("enter string");
		
		s=s1.nextLine();
		StringBuffer bf=new StringBuffer(s);
		StringBuffer bf1=new StringBuffer();
		String s2=bf.reverse()+"";
		for(int i=0;i<s.length()-1;i++){
			if(!s.equals(s2)){
				System.out.println(s);
				break;
			}
			else{
				bf1.append(s.charAt(i));
			}
		}
		System.out.println(bf1);
	}

}
