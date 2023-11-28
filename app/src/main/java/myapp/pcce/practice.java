package myapp.pcce;

import java.util.*;


public class practice {
	public static void main(String[] args) {
        String[] str = {"제라스", "제라스", "제라스", "진", "진", "이즈리얼", "이즈리얼", "이즈리얼", "이즈리얼", "이즈리얼", "워윅"};
        Map<String, Integer> map = new HashMap<>();

        for (String name : str) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        // Map의 entrySet을 List로 변환
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        // 내림차순으로 정렬
        Collections.sort(entryList, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // 정렬된 결과 출력
        int count = 0;
        for (Map.Entry<String, Integer> entry : entryList) {
        	if(count < 3) {        		
        		System.out.println(entry.getKey());
        		count++;
        	} else {
        		break;
        	}
        }
    }
}
