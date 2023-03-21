package programmers;

// 자릿수 더하기
public class Solution19 {
	public int solution(int n) {
		int answer = 0;

		String nToStr = n + "";
		
		for(int i = 0; i < nToStr.length(); i++) {
			answer += Integer.parseInt(nToStr.substring(i, i+1));
		}

	 	return answer;
	 }
}
