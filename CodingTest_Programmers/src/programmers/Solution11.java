package programmers;

import java.util.Stack;

// 햄버거 만들기
class Solution11 {

	public int solution(int[] ingredient) {
        
    	int answer = 0;
    	Stack<Integer> ingredients = new Stack<Integer>();
    	
    	for(int n : ingredient) {
    		ingredients.push(n);
    		int size = ingredients.size();
    		
    		if(size > 3 && ingredients.get(size-1) == 1
    				&& ingredients.get(size-2) == 3
    				&& ingredients.get(size-3) == 2
    				&& ingredients.get(size-4) == 1) {
    			makeBuger(ingredients);
    			answer++;
    		}
    	}
    	
        return answer;
    }
    
    void makeBuger(Stack<Integer> ingredients) {
    	ingredients.pop();
    	ingredients.pop();
    	ingredients.pop();
    	ingredients.pop();
    }
}
