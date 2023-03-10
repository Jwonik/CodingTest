package programmers;

import java.util.*;

// 같은 숫자는 싫어
public class Solution04 {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> tempList = new ArrayList<>();
        int tempNum = 10;
        
        for(int i = 0; i < arr.length; i++) {
            if(tempNum != arr[i]) {
                tempList.add(arr[i]);
            }
            tempNum = arr[i];
        }
        
        int[] answer = new int[tempList.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = tempList.get(i).intValue();
        }
        

        return answer;
    }
}