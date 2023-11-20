package myapp.level0.page03;

public class 부분문자열이어붙여문자열만들기 {
  public String solution(String[] my_strings, int[][] parts) {
    String answer = "";

    for(int i = 0; i < my_strings.length; i++) {
      char[] c = my_strings[i].toCharArray();
      for(int j = parts[i][0]; j <= parts[i][1]; j++) {
        answer += String.valueOf(c[j]);
      }

    }
    return answer;
  }
}
