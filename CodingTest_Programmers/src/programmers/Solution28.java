package programmers;

// 하샤드 수
public class Solution28 {
	public boolean solution(int x) {
        
		boolean answer = true;
        
        int sum = 0;
        
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        
        
        for(int i = 0; i < sb.length(); i++) {
        	sum += Integer.parseInt(sb.substring(i, i+1));
        }       
        
        if(x % sum != 0) {
        	answer = false;
        }
        
        
        return answer;
    }
}

