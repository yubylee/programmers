package myapp.level0.page05;

public class 숫자1로만들기 {
  public int solution(int[] num_list) {
    int count = 0;
    for(int i = 0; i < num_list.length; i++) {
      while(num_list[i] > 1) {
        if(num_list[i] % 2 == 0) {
          num_list[i] /= 2;
          count++;
        } else {
          num_list[i] = (num_list[i]-1)/2;
          count++;
        }
      }
    }
    return count;
  }
}
