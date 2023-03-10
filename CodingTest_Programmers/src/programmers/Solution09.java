package programmers;

import java.util.Arrays;

// 문자열 내림차순으로 배치하기
class Solution09 {
    public String solution(String s) {
        
    	String answer = "";
        StringBuilder stringBuilder = new StringBuilder();
        
        for(int i = 1; i <= s.length(); i++) {
        	char[] charArray = s.toCharArray();
        	Arrays.sort(charArray);
        	stringBuilder.append(charArray[s.length()-i]);
        }
        
        answer = stringBuilder.toString();
        
        return answer;
    }
}
