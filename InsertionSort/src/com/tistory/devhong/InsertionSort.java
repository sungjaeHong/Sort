package com.tistory.devhong;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {84,54,2,45,64,159,46,37,56,12,34,78};
		System.out.print("정렬 전 : ");
		printArr(arr);
		insertionSort(arr);
		System.out.print("정렬 후 : ");
		printArr(arr);
	}
	static void insertionSort(int[] arr)
	{
	   for(int index = 1 ; index < arr.length ; index++){
	      
	      int temp = arr[index];	//현재 index
	      int aux = index - 1;		//비교할 index

	      //현재 값보다 이전 값이 클때
	      while( (aux >= 0) && ( arr[aux] > temp) ) {
	         arr[aux+1] = arr[aux];	//이전값이 현재값보다 크므로 현재 index에 이전 값을 넣어줌
	         aux--;					//이전값 계속 탐색
	      }
	      arr[aux + 1] = temp;		//탐색한 index에 현재index값 넣어줌
	   }
	}
	
	static void printArr(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	

}
