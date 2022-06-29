package stream_api;
//sort the given numbers
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class H {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,23,3,46,100,98,21,36);
		List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNumbers);
	}
}
