package programmers;

import java.util.Arrays;

// 문자열 내 마음대로 정렬하기
class Solution07 {
    public String[] solution(String[] strings, int n) {
        
    	String[] answer = new String[strings.length];
        String[] sortStrings = new String[strings.length];
    	
        for(int i = 0; i < strings.length; i++) {
        	sortStrings[i] =  String.valueOf(strings[i].charAt(n)) + strings[i];
        }
        
        Arrays.sort(sortStrings);
        
        for(int i = 0; i < sortStrings.length; i++) {
        	answer[i] = sortStrings[i].substring(1);
        }
       
        return answer;
    }
}