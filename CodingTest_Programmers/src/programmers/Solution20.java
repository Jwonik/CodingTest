package programmers;

// 자연수 뒤집어 배열로 만들기
public class Solution20 {
	public int[] solution(long n) {
		
        StringBuilder sb = new StringBuilder();
        sb.append(n).reverse();
        int[] answer = new int[sb.length()];
        
        for(int i = 0; i < sb.length(); i ++) {
        	answer[i] = Integer.parseInt(sb.substring(i, i+1));
        }
        
        return answer;
    }
}
