package com.test;

import java.util.Arrays;
//≤Â»Î≈≈–ÚÀ„∑®
public class selectSort {
	//—°‘Ò≈≈–Ú
	public static void selectsort(int[] arr){

		for(int j=0;j<arr.length-1;j++){
			int index=j;
			int firstvalue=arr[index];
			for (int i = 0+j; i < arr.length; i++) {
				if(firstvalue>arr[i]){
					firstvalue=arr[i];
					index=i;
				}
			}
			if(index!=j){
				arr[index]=arr[j];
				arr[j]=firstvalue;
			}
			
		}

	
		System.out.print("dede"+Arrays.toString(arr));
	
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={101,34,119,1};
		
		selectsort(arr);

	}

}
