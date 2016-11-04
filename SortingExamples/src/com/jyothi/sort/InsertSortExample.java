package com.jyothi.sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InsertSortExample {
	private static void printNumbers(int[] input) {
        
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
	
	public List<Integer> insertSortList(List<Integer> numbers){
		List<Integer> sortedList = new LinkedList<>();
		
		// 4, 2, 9, 6, 23, 12, 34, 0, 1
		originalList: for (Integer number : numbers) {
			for (int i = 0; i < sortedList.size(); i++) {
				if (number < sortedList.get(i)) {
					sortedList.add(i, number);
					continue originalList;
				}
			}
			sortedList.add(sortedList.size(), number);
		}
		System.out.println("sortedlist " + sortedList.toString());
		return sortedList;
		
	}
	public void insertSort( int[] array){
		int length = array.length;
		int i = 0;
		// outer loop start with 2nd element which is 2 here
		// 4, 2, 9, 6, 23, 12, 34, 0, 1
		//
		for(int j=1; j < length; j++){
			// store the item
			//
			int item = array[j];
			i = j-1;
			while( (i >= 0) && array[i] > item ){
				// first run i=0 and has 4 and item = 2
				// swap them
				array[i+1] = array[i];
				array[i] = item;
				i--;
			}
			printNumbers(array);
		}
	}
	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		
		List<Integer> numbers = new ArrayList<>();
		for(int i = 0; i < input.length; i++){
			numbers.add(input[i]);
		}
		
		InsertSortExample ise = new InsertSortExample();
		ise.insertSort(input);
		
		List<Integer> sortedList = ise.insertSortList(numbers);
		System.out.println("SortedList = " + sortedList.toString());
	}

}
