package myapp.level0.page01;

import java.io.*;
import java.util.StringTokenizer;

public class 문자열반복해서출력하기 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str = st.nextToken();
		int n = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < n; i++) {
			System.out.print(str);
		}
	}
}
