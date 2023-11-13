package myapp.level0.page01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// char로 바꾼후 Character .. is~ 수정
public class 대소문자바꿔서출력하기_practice {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String answer = "";
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isUpperCase(c)) {
				answer += Character.toLowerCase(c);
			} else {
				answer += Character.toUpperCase(c);
			}
		}
		System.out.println(answer);
		
	}
}
