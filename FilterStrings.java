import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class FilterStrings {
	public static void main(String[] args) {
		List<String> li = Arrays.asList("abh","","Abh","ram","abhi","abc","abcd","agh");
		List<String> res = filterStrings(li);
		res.forEach(System.out::println);
	}

	static List<String> filterStrings(List<String> li) {
		return li.stream().filter(str -> str.startsWith("a") && str.length()==3)
						  .collect(Collectors.toList());
	}


}
