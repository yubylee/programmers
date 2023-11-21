package myapp.level0.page03;

public class 카운트다운 {
	public int[] solution(int start, int end_num) {
		int[] arr = new int[start - end_num + 1];
		int cnt = 0;
		for(int i = start; i >= end_num; i--) {
			arr[cnt] = i;
			cnt++;
		}
		return arr;
    }
}
