package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class J {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ball","Dog","Apple","Cat","Egg","Fish","Elephants","Apple");
		List<String> lNames = names.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
		System.out.println(lNames);
	}
}
