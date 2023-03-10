package algorithm;

// [알고리즘] - 선택정렬
// 선택정럴: 가장 작은 숫자를 찾아서 앞으로 보내는 방식
//
// 1) 정렬 방법
//(1) 주어진 리스트에서 최솟값을 찾는다.
//(2) 최솟값을 맨 앞자리의 값과 교환한다.
//(3) 맨 앞 자리를 제외한 나머지 값들 중 최솟값을 찾아 위와 같은 방법을 반복한다.
//
// 2) 장점
// (1) 추가적인 메모리 소비가 적다.
// 
// 3) 단점
// (1) 시간복잡도 O(N^2)
// (2) 안정 정렬이 아니다.
//
// 4) 코드 구현
public class Selection_Sort {
	
	public static void selection_sort(int[] a) {
		selection_sort(a, a.length);
	}
	
	public static void selection_sort(int[] a, int size) {
		
		for(int i = 0; i < size-1; i++) {
			
			int min_index = i;
			
			for(int j = i+1; j < size; j++) {
				if(a[j] < a[min_index]) {
					min_index = j;
				}
			}
			
			// i번째 값과 최솟값을 서로 교환
			swap(a, min_index, i);
		}
	}
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
