package stream_api;
//check whether given string contains "a"
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class L {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ball","Dog","Apple","Cat","Egg","Fish","Elephants");
		List<Boolean> contain = names.stream().map(s->s.contains("a")).collect(Collectors.toList());
		System.out.println(contain);
	}
}
