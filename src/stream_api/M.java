package stream_api;
//check & print whether given string contains "a"
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class M {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Apple","Ball","Cat","Dog");
		List<String> contains = names.stream().filter(s->s.contains("a")).collect(Collectors.toList());
		System.out.println(contains);
	}
}
