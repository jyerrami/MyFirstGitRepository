package com.jyothi.sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSortExample {

	public List<Integer> quicksort(List<Integer> numbers){
		if(numbers.size() < 2){
			return numbers;
		}
		//4, 2, 9, 6, 23, 12, 34, 0, 1
		// divide into two arrays
		int middle = numbers.get(0);
		List<Integer> lower = new ArrayList<>();
		List<Integer> higher = new ArrayList<>();
		
		for(int i=1; i< numbers.size(); i++ ){
			if(numbers.get(i) < middle ){
				lower.add(numbers.get(i));
			}
			else{
				higher.add(numbers.get(i));
			}
		}
		System.out.println(lower.toString() + "-" + middle + "-" + higher.toString());
		
		List<Integer> sorted = quicksort(lower);
		sorted.add(middle);
		sorted.addAll(quicksort(higher));
		return sorted;
		
	}
	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		List<Integer> numbers = new ArrayList<>();
		for(int i = 0; i < input.length; i++){
			numbers.add(input[i]);
		}
		
		QuickSortExample qse = new QuickSortExample();
		List<Integer> sorted = qse.quicksort(numbers);
		System.out.println("Sorted list "+ sorted.toString());
	}

}
