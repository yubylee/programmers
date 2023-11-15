package myapp.level0.page02;

public class 마지막두원소 {
	public int[] solution(int[] num_list) {
		int[] arr = new int[num_list.length + 1];
		System.arraycopy(num_list, 0, arr, 0, num_list.length);
		
			if(num_list[num_list.length-1] > num_list[num_list.length-2]) {
				arr[arr.length-1] = num_list[num_list.length-1] - num_list[num_list.length-2];
			} else {
				arr[arr.length-1] = num_list[num_list.length-1] * 2;
			}
		return arr;
    }
}
