package myapp.level0.page04;

public class 수열과구간커리1 {
	public int[] solution(int[] arr, int[][] queries) {
		for(int i = 0; i < queries.length; i++) {
			for(int j = queries[i][0]; j <= queries[i][1]; j++) {
				arr[j]++;
			}
		}
		return arr;
	  }
}
