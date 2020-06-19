package intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sortExample {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Hong",100)
											  ,new Student("Lee",50)
											  ,new Student("Kim",70));
		
		students.stream().sorted().forEach(s -> System.out.println(s));
		
		System.out.println();
		
		List<Person> persons = Arrays.asList(new Person("Hong",10)
											,new Person("Lee",20)
				  					        ,new Person("Kim",30)
				);
		persons.stream().sorted(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.age - o2.age;
			}
		}).forEach(System.out::println);
		
		//compareTo
		//2개의 두 문자열을 비교하고 int형 값을 반환하는 메소드
		//맨 첫자리부터 차례대로 비교하는 특성있음.
		System.out.println("a".compareTo("b"));
	}
}
