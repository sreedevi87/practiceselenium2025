package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Feature1 {

	public static void main(String[] args) {
		List<Integer> numberList=new ArrayList<Integer>(Arrays.asList(3,8,67,32,89,67,0,32,0,8));
		numberList.stream().sorted().distinct().collect(Collectors.toList()).forEach(System.out::println);
	}

}
