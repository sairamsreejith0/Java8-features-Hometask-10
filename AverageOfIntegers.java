import java.util.Arrays;
import java.util.List;
public class AverageOfIntegers {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1,2,3,4,5);
		System.out.println("The Average of given list of Integers is "+ findAverage(li));
	}

	 static Double findAverage(List<Integer> li) {
		 return (li.stream().mapToDouble(i-> i)
				 			.reduce(0, (a,b)->a+b))/li.size();
	}

}
