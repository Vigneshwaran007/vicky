public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		String s=n+"";
		int a[]=new int[s.length()];
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++){
			a[i]=c[i]-48;
		}
		int e=0;
		for(int i=0;i<a.length-1;i++){
			 e+=(int) Math.pow(a[i],a[i+1]);
		}
		e=e+1;
		System.out.println(e);
	}
	}
