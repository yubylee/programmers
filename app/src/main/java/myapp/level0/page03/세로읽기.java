package myapp.level0.page03;

public class 세로읽기 {
  public String solution(String my_string, int m, int c) {
    char[][] arr = new char[my_string.length()/m][m];
    char[] cc = my_string.toCharArray();
    int cnt = 0;
    String result = "";
    for(int i = 0; i < my_string.length()/m; i++) {
      for(int j = 0; j < m; j++) {
        arr[i][j] = cc[cnt];
        cnt++;
      }
    }
    for(int k = 0; k < my_string.length()/m; k++) {
      result += arr[k][c-1];
    }

    return result;
  }
}
