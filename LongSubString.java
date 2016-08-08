# vicky
package String;

import java.util.Scanner;	
	public class LongSubString {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter your string");
			String s = s1.next();
			String[] sub = new String[15];
			int v = 0;
			s1.close();
			for (int i = 0; i < s.length(); i++) {
				for (int j = i + 1; j <= s.length(); j++) {
					sub[v] = s.substring(i, j);
					v++;
				}
			}

			String[] su = new String[v];
			int t = 0;
			for (int j = 0; j < v; j++) {
				if (s.compareTo(sub[j]) < 0) {
					su[t] = sub[j];
					t++;
				}
			}
			int len = 0;
			String ans = "";
			for (int l = 0; l < t; l++) {
				if (len < su[l].length()) {
					len = su[l].length();
					ans = su[l];
				}
			}

			System.out.println(len);
			System.out.println(ans);
		}

	}

