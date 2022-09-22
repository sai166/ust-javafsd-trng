package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream6 {
	public static void main(String[] args) {
		List<String>lines=Arrays.asList("Walnut","Apricot","almond");
		List<String>result=lines.stream().filter(line->!"almond".equals(lines)).collect(Collectors.toList());
		result.forEach(System.out::println);
	}

}
