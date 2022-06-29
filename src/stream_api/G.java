package stream_api;
//sort the given String
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class G {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ball","Dog","Apple","Cat","Egg","Fish","Elephants","Apple");
		List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNames);
	}
}
