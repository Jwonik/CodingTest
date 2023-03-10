package programmers;

import java.util.Arrays;

// 나누어 떨어지는 숫자 배열
class Solution05 {
    public int[] solution(int[] arr, int divisor) {
       
    	int dividedCnt = 0;
    	int index = 0;
    	
    	for(int num : arr) {
    		if(num % divisor == 0) {
    			dividedCnt++; 
    		}
    	}
       
    	if(dividedCnt==0) {
    		int[] answer = {-1};
    		return answer;
    	}
    	
    	int[] answer = new int[dividedCnt];
    	
    	for(int i = 0; i < arr.length; i++) {
    		if(arr[i] % divisor == 0) {
    			answer[index] = arr[i];
    			index++;
    		}
    	}
  
       Arrays.sort(answer);
       
       return answer;   
    }
}