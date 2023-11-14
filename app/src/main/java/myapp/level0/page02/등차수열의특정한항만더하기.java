package myapp.level0.page02;

public class 등차수열의특정한항만더하기 {
	public int solution(int a, int d, boolean[] included) {
		int result = 0;
		int[] arr = new int[included.length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = a;
			a += d;
		}
		for(int i = 0; i < included.length; i++) {
			if(included[i] == true) { 
				result += arr[i];
			}
		}
		return result;
	  }
}
