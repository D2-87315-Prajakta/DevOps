package com.operations;

public class Operations {
	
	public static Result operations(int[] arr) {
		
		if(arr.length == 0) {
			return null;
		}
		
		int sum = 0;
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		double average  = sum/arr.length;
		
		Result res = new Result();
		res.setSum(sum);
		res.setMax(max);
		res.setAverage(average);
		
		
		return res;
	}

	public static void main(String[] args) {
		
		Result res = new Result();
		
		int[] arr = {10,20,30,40,50,60};
		
		res = operations(arr);
		
		System.out.println("The result is: " +res);
		
		
		

	}

}
