package com.producerconsumer;

import java.util.HashSet;

public class LongestIntegerSequence {

	private void displayArray(int [] arr)
	{
		for  (int index = 0; index< arr.length; ++index) {
			System.out.println(" Arr [" + index +"] :" + arr[index]);
		}
	}
	
	private void swap(int index1, int index2, int []arr) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	private void sortArray(int [] arr) {
		for (int index = 0; index< arr.length - 1; ++index) {
			for (int index_1 = index +1; index_1 < arr.length; ++index_1 ) {
				if (arr[index] > arr[index_1]) {
					this.swap(index, index_1, arr);
				}
			}
		}
	}
	public int findLongestIntegerSequence(int []arr) {
		this.displayArray(arr);
		//Sort the array here.
		this.sortArray(arr);
		//this.displayArray(arr);
		 
		int longestSequenceCount = 0;
		int tempCount = longestSequenceCount;
		
		for (int index = 0; index < arr.length; ++index) {
			if ( (index + 1 < arr.length) && arr[index+1] - arr[index]  == 1) {
				++tempCount;
			}else {
				if (longestSequenceCount < tempCount) {
					longestSequenceCount = tempCount;
				}
			}
		}
		
		return longestSequenceCount;
		
	}
	
	public int findLongestIntergerSequenceUsingSet(int []arr) {
		
		int longestSequenceCount = 0;
		HashSet<Integer> arraySet = new HashSet<Integer>();
		for (int i = 0; i< arr.length; ++i) {
			arraySet.add(arr[i]);
		}
		
		for (int i = 0; i < arr.length; ++i) {
			if (!arraySet.contains(arr[i] - 1)) {
				int j = arr[i];
				while (arraySet.contains(j))
					j++;
				
				if (longestSequenceCount < j - arr[i]) {
					longestSequenceCount = j - arr[i];
				}
			}
		}
		
		return longestSequenceCount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] integerSequence = {2,5,3,10,11,4,15};
		
		LongestIntegerSequence obj = new LongestIntegerSequence();
		System.out.println("Length of Longest Integer Sequence :" 
		+ obj.findLongestIntegerSequence(integerSequence));
		
		System.out.println("New Method :"+obj.findLongestIntergerSequenceUsingSet(integerSequence));
		
	}

}
