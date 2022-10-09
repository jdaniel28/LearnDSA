package sortTest;

import java.util.Random;
import java.util.Arrays;

public class SortMain {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[100000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(Integer.MAX_VALUE); // storing random integers in an array
//			System.out.println(arr[i]); // printing each array element
		}
		long startTime = System.currentTimeMillis();
		int[] mergedArr = mergeSort(Arrays.copyOf(arr, arr.length));
		long endTime = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		Arrays.stream(mergedArr).forEach(ele -> sb.append(ele + " "));
//		System.out.println(sb.toString().trim());
		System.out.println("Time taken for merge sort : " + (endTime - startTime));

		startTime = System.currentTimeMillis();
		int[] bubbledArr = bubbleSort(Arrays.copyOf(arr, arr.length));
		endTime = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder();
		Arrays.stream(bubbledArr).forEach(ele -> sb1.append(ele + " "));
//		System.out.println(sb1.toString().trim());
		System.out.println("Time taken for bubble sort : " + (endTime - startTime));

		startTime = System.currentTimeMillis();
		int[] selectedArr = selectionSort(arr);
		endTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder();
		Arrays.stream(selectedArr).forEach(ele -> sb2.append(ele + " "));
//		System.out.println(sb2.toString().trim());
		System.out.println("Time taken for selection sort : " + (endTime - startTime));
		System.out.println("All sorts equal : " + (sb1.toString().trim().equals(sb2.toString().trim())
				&& sb2.toString().trim().equals(sb.toString().trim())));
	}

	private static int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

	private static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	private static int[] mergeSort(int[] arr) {
		if (arr.length <= 1) {
			return arr;
		}
		int leftEnd = arr.length / 2;
		int rightEnd = arr.length;
		int[] leftArr = Arrays.copyOfRange(arr, 0, leftEnd);
		int[] rightArr = Arrays.copyOfRange(arr, leftEnd, rightEnd);
		leftArr = mergeSort(leftArr);
		rightArr = mergeSort(rightArr);
		int leftPoint = 0;
		int rightPoint = 0;
		for (int i = 0; i < arr.length; i++) {
			if (leftPoint < leftArr.length && rightPoint < rightArr.length) {
				int rightVal = rightArr[rightPoint];
				int leftVal = leftArr[leftPoint];
				int temp = Math.min(leftVal, rightVal);
				arr[i] = temp;
				if (temp == rightVal) {
					++rightPoint;
				} else {
					++leftPoint;
				}
			} else if (leftPoint < leftArr.length) {
				arr[i] = leftArr[leftPoint];
				++leftPoint;
			} else {
				arr[i] = rightArr[rightPoint];
				++rightPoint;
			}
		}
//		StringBuilder sb = new StringBuilder().append("Array values : ");
//		Arrays.stream(arr).forEach(ele -> sb.append(ele + " "));
//		System.out.println(sb.toString().trim());
		return arr;
	}
}
