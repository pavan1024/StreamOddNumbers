package com.epam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOddNumbers {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16);
		
		List<Integer> oddNumbers = numbers.stream().filter(i->i%2!=0).collect(Collectors.toList());
		
		oddNumbers.forEach(i->System.out.println(i));
	}

}
