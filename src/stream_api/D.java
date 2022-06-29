package stream_api;
//no of time of occurance of given string
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class D {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Stream","Collection","Stream","sam","Stream","Reflection");
		List<String> newNames = names.stream().filter(s->s.equals("Stream")).collect(Collectors.toList());
		System.out.println(newNames);
		System.out.println(newNames.size());
	}
}
