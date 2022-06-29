package stream_api;
//particular string starts with S
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sister","Collection","Stream","Sim","Simmy","Reflection");
		List<String> names1 = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
		System.out.println(names1);
		System.out.println(names1.size());
	}
}
