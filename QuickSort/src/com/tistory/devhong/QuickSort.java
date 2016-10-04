package com.tistory.devhong;

import java.util.Random;

public class QuickSort {
	public static void main(String[] args) {
		/*int arr[] = new int[10];
		Random randomNumber = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = randomNumber.nextInt(arr.length);
		}*/
		int arr[] = {9, 6, 9, 9, 4, 6, 8, 8, 2, 7};
		System.out.println("정렬 전");
		printArr(arr);
		quickSort(arr,0,arr.length-1);
		System.out.println("정렬 후");
		printArr(arr);

	}
	
	public static void quickSort(int[] arr, int l, int r){
        int left = l;
        int right = r;
        int pivot = arr[(l+r)/2];
       
        while (left <= right){						//왼쪽에서 비교하는 index와 오른쪽에서 비교하는 index가 역전되지않도록
            while(arr[left] < pivot) left++;		//피벗보다 큰 값을 왼쪽부터 찾아나감
            while(arr[right] > pivot) right--;		//피벗보다 작은값을 오른쪽부터 찾아나감
            if(left <= right){    					//left와 right에서 찾은 값을 서로 바꿈
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
                printArr(arr);
            }
            
        }											//왼쪽비교값과 오른쪽비교값이 교차하면 정지
        if(l < right) {
        	quickSort(arr, l, left-1);	}			//바꾼 index를 기반으로 부분배열을 인자로 하여 재정렬
        if(r > left){
        	quickSort(arr, left, r);				//바꾼 index를 기반으로 부분배열을 인자로 하여 재정렬
        }
    }



	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
