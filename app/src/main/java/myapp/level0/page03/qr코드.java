package myapp.level0.page03;

public class qr코드 {
  public String solution(int q, int r, String code) {
    char[] c = code.toCharArray();
    String answer = "";
    for(int i = 0; i < c.length; i++) {
      if(i % q == r) {
        answer += c[i];
      }
    }
    return answer;
  }
}
