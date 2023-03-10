package programmers;

import java.util.ArrayList;

// 폰켓몬
class Solution01 {
    public int solution(int[] nums) {
        int answer = 0;
        int maxPocetmon = nums.length/2;
        ArrayList<Integer> getPocetmon = new ArrayList<>(); 
        
        for(int num : nums) {
        	if(getPocetmon.indexOf(num)==-1) {
        		getPocetmon.add(num);
        		if(answer==maxPocetmon) {
        			return answer;
        		}
        		answer++;
        	}
        }
        
        return answer;
    }
}