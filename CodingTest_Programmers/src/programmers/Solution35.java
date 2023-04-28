package programmers;

// [1차] 비밀지도
public class Solution35 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
        
    	String[] answer = new String[n];
    	String[] binaryStringArr = new String[n];
        
        for(int i = 0; i < n; i++) {
        	long num = arr1[i] | arr2[i];
        
        	binaryStringArr[i] = String.format("%0"+n+"d", Long.parseLong(Long.toBinaryString(num)));       
        }
        
        for(int i = 0; i < n; i++) {
        	String str = "";
        	for(int j = 0; j < n; j++) {
        		if(binaryStringArr[i].charAt(j) == '1') {
        			str += "#";
        		}else {
        			str += " ";
        		}
        	}
        	answer[i] = str;
        }
   	
        return answer;
    }
}



