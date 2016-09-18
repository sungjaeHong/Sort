package SelectionSort;

import java.util.Random;

public class Launcher {

	public static void main(String[] args) {
		int[] arr = new int[100];
		int[] sortArr = new int[100];
		Random randomNumber = new Random();
		for(int i=0;i<100;i++){
			arr[i] = randomNumber.nextInt(100);
		}
		SelectionSort selectionSort = new SelectionSort();
		sortArr = selectionSort.selectionSort(arr);
		
		for(int i=0;i<sortArr.length;i++){
			System.out.print(sortArr[i]+" ");
		}
	}

}
