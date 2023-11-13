package myapp.level0.page01;

import java.io.*;


public class 문자열돌리기 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			System.out.println(c);
		}
	}
}
