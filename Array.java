public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		String s1="";
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			sb.append(a[i]);
		}
		s1=sb+"";
		System.out.println(s1);
		char c[]=s1.toCharArray();
		for(int i=0;i<s1.length();i++){
		int count=s1.replaceAll("[^"+c[i]+"]","").length();
		//System.out.println(count);
		if(count==1){
			System.out.println(c[i]);
		}
		}
	}

}
