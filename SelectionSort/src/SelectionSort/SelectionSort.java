package SelectionSort;

public class SelectionSort {
	public int[] selectionSort(int[] arr){
		int min;
		for(int i=0;i<arr.length;i++){
			min = i;
			for(int j=i+1;j<arr.length;j++){ 	//정렬된 다음의 index부터 비교
				if(arr[j]<arr[min]){			//기준index가 비교index의 값보다 클 경우 index 기억 
					min = j;
				}
			}									//기억된 index로 loop 후 치환
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}
}
