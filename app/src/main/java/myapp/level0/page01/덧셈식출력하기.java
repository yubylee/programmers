package myapp.level0.page01;

import java.io.*;
import java.util.StringTokenizer;

public class 덧셈식출력하기 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a + " + " + b + " = " + (a+b));
		
	}
}
