package intermediate;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingExample2 {
	public static void main(String[] args) {
		List<Employee> employees = Employee.persons();
		
		employees.stream().map(t->t.getName())
						  .filter(t -> t.startsWith("H"))
					  	  .forEach(s->System.out.println(s));
		
		System.out.println();
		
		employees.stream().map(new Function<Employee, String>() {
			@Override
			public String apply(Employee t) {
				return t.getName();
			}
		}).flatMap(new Function<String, Stream<Character>>(){
			public Stream<Character> apply(String t) {
				return IntStream.range(0, t.length()) //range는 길이만큼 int타입의 스트림을 만들어줌. object타입으로 매핑한다
								.mapToObj(new IntFunction<Character>() { //mapToObj int타입을 받아서 obj타입으로 바꿔주겠다
					@Override
					public Character apply(int value) {
						return t.charAt(value);
					}
				});
			}
		}).forEach(s->System.out.println(s));
	}
}
