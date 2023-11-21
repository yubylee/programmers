package myapp.level0.page03;

public class 가까운1찾기 {
	public int solution(int[] arr, int idx) {
		for(int i = idx; i < arr.length; i++) {
			if(arr[i] == 1) {
				return i;
			}
		} 
		return -1;
	}
}
