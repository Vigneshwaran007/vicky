public class Encription {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java";
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++){
			int a=c[i];
			if(a==97){
				c[i]=(char)(a+25);
			}
			else
			c[i]=(char)(a-1);
			System.out.println(c[i]);
			
		}
	}

}
