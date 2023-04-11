package programmers;

import java.util.ArrayList;
import java.util.Arrays;

// 제일 작은 수 제거하기
public class Solution23 {
	public int[] solution(int[] arr) {
        int[] answer = {};
        int[] tempArr = new int[arr.length];  
        
        for(int i = 0; i < arr.length; i++) {
        	tempArr[i] = arr[i];
        }
        
        Arrays.sort(tempArr);
        int min = tempArr[0];
        
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] != min) {
        		list.add(arr[i]);
        	}
        }
       
        if(list.size() == 0) { // 빈 배열일 때
        	answer = new int[1];
        	answer[0] = -1;
        	
        }else if(list.size() == 1 && list.get(0) == 10) { // 배열에 10만 담겨있을 때
        	answer = new int[list.size()];
        	answer[0] = -1;
        	
        } else {
        	answer = new int[list.size()];
        	for(int i = 0; i < list.size(); i++) {
        		answer[i] = list.get(i);
        	}
        }
        return answer;
    }
}


