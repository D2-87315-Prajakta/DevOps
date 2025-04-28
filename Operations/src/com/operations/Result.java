package com.operations;

public class Result {
	
	private int sum;
	private int max;
	private double average;
	
	public Result() {
		
	}
	
	public Result(int sum, int max, double average) {
		super();
		this.sum = sum;
		this.max = max;
		this.average = average;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	@Override
	public String toString() {
		return "Result [sum=" + sum + ", max=" + max + ", average=" + average + "]";
	}
	
//	public static Result operations(int[] arr) {
//	
//	if(arr.length == 0) {
//		return null;
//	}
//	
//	int sum = 0;
//	int max = 0;
//	
//	for(int i=0; i<arr.length; i++) {
//		sum += arr[i];
//		
//		if(arr[i]>max) {
//			max = arr[i];
//		}
//	}
//	
//	double average  = sum/arr.length;
//	
//	Result res = new Result();
//	res.setSum(sum);
//	res.setMax(max);
//	res.setAverage(average);
//	
//	
//	return res;
//}

	

}
