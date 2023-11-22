package myapp.level0.page03;


import java.util.Arrays;


public class 숫자2의영역 {
	public int[] solution(int[] arr) {
		int min = 100000, max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 2) {
				min = Math.min(min, i);
				max = Math.max(max, i);
			}
		}
		if(min <= max) {
			return Arrays.copyOfRange(arr, min, max + 1);
		} else {
			return new int[] {-1};
		}
		
	  }
}
