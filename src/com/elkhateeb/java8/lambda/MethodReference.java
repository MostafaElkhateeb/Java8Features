package com.elkhateeb.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;

public class MethodReference {
	
	public static boolean isPrimeNumber(int number) {
		if (number == 2 ) return true;
		if (number < 2)  return false;
		for(int i = 2; i < Math.sqrt(number)+1 ; i++)
		{
			if(number % i == 0)
				return false;
		}
		return true;
	}
	

	public static List<Integer> findPrimeNumbers(List<Integer> list, IntPredicate p) {
		List<Integer> primeList = new ArrayList<>();
		for (Integer number : list) {
			if (p.test(number)) {
				primeList.add(number);
			}
		}
		return primeList;
	}
	
	public static void main(String[] args){
		
		List<Integer> list = Arrays.asList(2,3,4,5,6,7,8);
		
		
		//using anonymous class
		List<Integer> res1 = findPrimeNumbers(list, new IntPredicate() {
			@Override
			public boolean test(int value) {
				return MethodReference.isPrimeNumber(value);

			}
		});
		System.out.println(res1);
		
		//using lambda expression
		List<Integer> res2 = findPrimeNumbers(list, (i1) -> MethodReference.isPrimeNumber(i1));
		System.out.println(res2);
		
		//using method reference
		List<Integer> res3 = findPrimeNumbers(list, MethodReference::isPrimeNumber);
		System.out.println(res3);

		
	}

}
