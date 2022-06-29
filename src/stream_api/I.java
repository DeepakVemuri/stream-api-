package stream_api;
//Convert the given string to upper case
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class I {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ball","Dog","Apple","Cat","Egg","Fish","Elephants","Apple");
		List<String> uNames = names.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(uNames);
	}
}
