package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//square
public class C {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> square = numbers.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(square);
	}
}
