package programmers;

// 평균 구하기
public class Solution27 {
	public double solution(int[] arr) {
        
		double answer = 0;
        double sum = 0;
        
        for(int num : arr) {
        	sum += num;
        }
        
        answer = sum / arr.length;
        
        return answer;
    }
}


