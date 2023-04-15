package programmers;

// 핸드폰 번호 가리기
public class Solution29 {
	public String solution(String phone_number) {
        
		String answer = "";                
        
		String hide_number = phone_number.substring(0, phone_number.length()-4);
        int len = hide_number.length();
        
        answer = phone_number.replace(hide_number, "*".repeat(len));
        
        return answer;
    }
}

