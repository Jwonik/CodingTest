package programmers;

import java.util.Arrays;

// 정수 내림차순으로 배치하기
public class Solution21 {
	public long solution(long n) {
        long answer = 0;
        
        String[] strArr = String.valueOf(n).split("");
        Arrays.sort(strArr);
        
        StringBuilder sb = new StringBuilder();
        for(String str : strArr) {
        	sb.append(str);
        }
        
        answer = Long.parseLong(sb.reverse().toString());
        
        return answer;
    }
}
