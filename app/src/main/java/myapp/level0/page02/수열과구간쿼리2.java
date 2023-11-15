package myapp.level0.page02;

import java.util.Arrays;

public class 수열과구간쿼리2 {
	public int[] solution(int[] arr, int[][] queries) {
		int[] result = new int[queries.length];
		Arrays.fill(result, Integer.MAX_VALUE);
		for(int i = 0; i < queries.length; i++) { 
			for(int j = queries[i][0]; j<=queries[i][1]; j++) {
				if(arr[j] > queries[i][2]) {
					if(result[i] > arr[j]) {
						result[i] = arr[j];
					} 
				} 
				}
			if(result[i] == Integer.MAX_VALUE) {
				result[i] = -1;
			}
			}
			
	
		
		return result;
    }
}
