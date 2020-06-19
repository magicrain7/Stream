package intermediate;

import java.util.List;

public class FilterExample {
	public static void main(String[] args) {
		// Filter: true 값만 걸러냄
		List<Employee> employees = Employee.persons(); 
		employees.stream()
						.filter(( t) -> t.getIncome() > 3000 ) 
						.filter(( t) -> t.isFemale())
						.peek(System.out::println)
//						.forEach((Employee s)->System.out.println(s.toString()));
						.forEach((Employee s)->s.setIncome(s.getIncome() * 1.5));
			System.out.println("성과급 지급 후");
			employees.stream().forEach(System.out::println);
	}
}
