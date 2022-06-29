package stream_api;
//length of each String
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class K {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ball","Dog","Apple","Cat","Egg","Fish","Elephants","Apple");
		List<Integer> length = names.stream().map(s->s.length()).collect(Collectors.toList());
		System.out.println(length);
	}
}
