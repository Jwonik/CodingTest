package programmers;

// 최대공약수와 최소공배수
public class Solution25 {
	public int[] solution(int n, int m) {
	     
    	int[] answer = new int[2];
        
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        // 최대 공약수 구하기
        while(min != 0) {
        	int r = max % min;
        	max = min;
        	min = r;
        }
        
        // 최소 공배수 = 두 수의 곱 / 최대공약수
        int gcd = n * m / max;
        
        answer[0] = max;
        answer[1] = gcd;  
        
        return answer;
    }
}



