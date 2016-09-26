package com.tistory.devhong;

import java.util.Random;

public class QuickSort {
	public static void main(String[] args) {
		int arr[] = new int[100];
		Random randomNumber = new Random();
		for(int i=0;i<arr.length;i++){
			arr[i] = randomNumber.nextInt(arr.length);
		}
		int arr2[] = {3, 7, 5, 1, 6, 2, 4};
		System.out.println("정렬 전");
		printArr(arr);
		quickSort(arr2, 0, arr2.length-1);
		System.out.println("정렬 후");
		printArr(arr);
		

	}
	public static void quickSort(int arr[], int left, int right){
		int partition = partition(arr, left, right);
		if(left<partition-1)
			quickSort(arr, left, partition-1);
		if(partition<right)
			quickSort(arr,partition,right);
	}
	
	public static int partition(int arr[], int low, int high){
		int i = low;
		int j = high;
		int temp = 0;
		int pivot = arr[(low+high)/2];
		
		while(i<=j){
			while(arr[i] < pivot){
				i++;
			}
			while(arr[j] > pivot){
				j--;
			}
			if(i<=j){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		System.out.println("return : " + i);
		return i;
	}
	public static void printArr(int[] arr){
		for(int i : arr){
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
}
