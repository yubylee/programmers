package myapp.level0.page01;

import java.io.*;


public class 홀짝구분하기 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		if(a % 2 == 0) {
			System.out.println(a + " is even");
		} System.out.println(a + " is odd");
	}
}
