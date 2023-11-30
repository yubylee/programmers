package myapp.level0.page04;

public class 조건에맞게수열변환하기2 {
	public int solution(int[] arr) {
        int answer = 0;
        int loopCnt = 0;
        while(answer == 0) {
        	int changeCnt = 0;
        	for(int i = 0; i < arr.length; i++) {
        		if(arr[i] >= 50 && arr[i]%2 == 0) {
        			arr[i] /= 2;
        			changeCnt++;
        		} else if(arr[i] < 50 && arr[i]%2 != 0) {
                    arr[i] = (arr[i]*2)+1;
                    changeCnt++;
                }
        	}
        	loopCnt++;
        	if(changeCnt == 0) answer = loopCnt;
        }
        return answer-1;
        
    }
}
