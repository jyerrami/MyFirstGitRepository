package com.jyothi.sort;

public class BubbleSortExample {

	public void bubbleSort(int[] numbers){
		boolean numbersSwitched = false;
		do{
			//for i between 0 and (array length – 1):
			//if (array(i + 1) < array(i)):
			//switch array(i) and array(i + 1)
			//repeat until a complete iteration where no elements are switched.
			// 6, 4, 9, 5 -> 4, 6, 9, 5: When i = 0, the numbers 6 and 4 are switched
			// 4, 6, 9, 5 -> 4, 6, 5, 9: When i = 2, the numbers 9 and 5 are switched etc
			numbersSwitched = false;
			for(int i=0; i< numbers.length -1 ; i++){
				if(numbers[i+1] < numbers[i]){
					// switch them
					int tmp = numbers[i];
					numbers[i] = numbers[i+1];
					numbers[i+1] = tmp;
					numbersSwitched = true;
				}
			}
		}while(numbersSwitched);
	}
	public static void main(String[] args) {
		BubbleSortExample abse = new BubbleSortExample();
		int[] numbers = new int[]{4,6,9,8,5};
		abse.bubbleSort(numbers);
		System.out.print("sorted numbers = ");
		for(int i=0; i< numbers.length; i++)
			System.out.print( numbers[i]);
	}

}
