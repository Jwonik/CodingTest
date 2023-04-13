package programmers;

// 콜라츠 추측
public class Solution26 {
	public int solution(int num) {
    	long n = num;
    	
    	int answer = 0;
    	
    	while(n != 1) {
    		
    		answer++;
    		
    		if(answer >= 500) {
    			answer = -1;
    			break;
    		}
    		
    		if(n % 2 == 0) {
    			n = n / 2;
    		}else {
    			n = n*3 + 1;
    		} 
    		   		
    	}
        
        return answer;
    }
}
