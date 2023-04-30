package programmers;

// [1차] 다트 게임
public class Solution36 {
	public int solution(String dartResult) {
        int answer = 0;
        
        String numStr = "";
        int num = 0; 
        
        int[] score = new int[3];
        int idx = 0;
        
        for(int i = 0; i < dartResult.length(); i++) {
        	char ch = dartResult.charAt(i);
        	
        	if('0' <= ch && ch <= '9') {
        		  numStr += ch;               		  
        	}else if(ch == 'S' || ch == 'D' || ch == 'T') {
        		num = Integer.parseInt(numStr);        		
        		
        		if(ch == 'S') {
        			score[idx++] = (int) Math.pow(num, 1);
        		}else if(ch == 'D') {
        			score[idx++] = (int) Math.pow(num, 2);
        		}else {
        			score[idx++] = (int) Math.pow(num, 3);
        		}
        		numStr = "";        		
        	}else {
        		if(ch == '*') {
        			score[idx-1] *= 2;
        			if(idx-2 >= 0) 
        				score[idx-2] *= 2;
        		}else {
        			score[idx-1] *= (-1);
        		}
        	}       	
        }
        
        answer = score[0] + score[1] + score[2];
    	
        return answer;
    }
}
