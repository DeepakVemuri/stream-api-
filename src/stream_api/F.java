package stream_api;
//particular string ends with n
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class F {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sister","Collection","Stream","Sim","Simmy","Reflection");
		List<String> newNames = names.stream().filter(s->s.endsWith("n")).collect(Collectors.toList());
		System.out.println(newNames.size());
		System.out.println(newNames);
	}
}
