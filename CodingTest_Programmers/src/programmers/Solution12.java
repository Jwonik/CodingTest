package programmers;

import java.util.ArrayList;

// 둘만의 암호
class Solution12 {
    public String solution(String s, String skip, int index) {

    	StringBuilder answer = new StringBuilder();
        char[] sArr = s.toCharArray();
      
        ArrayList<Character> list = new ArrayList<>();
        
    	for(char i='a'; i<='z'; i++) {
    		if(skip.indexOf(i) == -1) {
    			list.add(i);
    			System.out.print(i+" ");
    		}
    	}
    	
    	
    	for(int i = 0; i < sArr.length; i++) {
    		
    		char ch = sArr[i];  		
    		int num = list.indexOf(ch) + index;
    		
    		if(num > list.size()-1) {
    			num = num%list.size();
    		}  		
       		answer.append(list.get(num));   		
    	}
    		
        return answer.toString();
    }
}


