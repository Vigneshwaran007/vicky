public class Substring {
		public static void main(String args[]){
			String s="";
			if(args.length>0){
				s=args[0];
			}
			for(int i=0;i<args.length;i++){
				String s1=args[i];
				int j=0;
				for(;j<Math.min(s.length(),args[i].length());j++){
					if(s.charAt(j)!=s1.charAt(j)){
						break;
					}
				}
				s=args[i].substring(0,j);
			}
			System.out.println(s);
		}
	}
