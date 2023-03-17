package programmers;

// 시저 암호
public class Solution16 {
	public String solution(String s, int n) {
        String answer = "";
        
        char[] sToCharArr = s.toCharArray();
        
        for(char ch : sToCharArr) {
        	if(ch == ' ') {
        		answer += ' ';
        	}else if(ch >= 'a' && ch <= 'z') {
        		if(ch + n > 90) {
        			ch =  (char)(ch + n - 26);
        		}else {
        			ch += n;
        		}
        		answer += ch;
        	}else if(ch >= 'A' && ch <= 'Z') {
        		if(ch + n > 122) {
        			ch =  (char)(ch + n - 26);
        		}else {
        			ch += n;
        		}
        		answer += ch;
        	}
        }
        
        return answer;
    }
}
