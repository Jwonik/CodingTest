package algorithm;

// [알고리즘] - 버블정렬 
// 버블정렬: 두 개의 인접한 원소를 비교하여 정렬하는 방식
//
// 1) 정렬 방법
// (1) 앞에서부터 현재 원소와 바로 다음의 원소를 비교한다.
// (2) 현재 원소가 다음 원소보다 크면 원소를 교환한다.
// (3) 다음 원소로 이동하여 해당 원소와 그 다음 원소를 비교한다.

// => 각 라운드를 진행할 떄마다 뒤에서부터 한 개씩 정렬된다.
//    총 라운드: 배열 크기 - 1
//    각 라운드별 비교 횟수: 배열 크기 - 라운드 횟수

// 3) 장점
// (1) 추가적인 메모리 소비가 적다.
// (2) 구현이 매우 쉽다.
// (3) 안정 정렬이 가능하다.

// 4) 단점
// (1) 다른 정렬 알고리즘에 비해 교환과정이 많아 많은 시간을 소비한다.

// 5) 코드 구현
public class Bubble_Sort_Bad {
	
	public static void bubble_sort(int[] a) {
		bubble_sort(a, a.length);
	}
	
	private static void bubble_sort(int[] a, int size) {
		
		// round는 배열 크기 - 1 만큼 진행됨 
		for(int i = 1; i < size; i++) {
			
			// 각 라운드별 비교횟수는 배열 크기의 현재 라운드를 뺀 만큼 비교함
			for(int j = 0; j < size-1; j++) {
				if(a[j] > a[j+1]) {
					swap(a, j, j+1);
				}
			}
		}	
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
}
