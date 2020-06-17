package basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Student{
	//필드
	private String name;
	private int score;
	
	//생성자
	public Student(String name, int score) {
		this.name =name;
		this.score = score;
	}
	
	//get 메소드
	public String getName() {
		return this.name;
	}
	public int getScore() {
		return this.score;
	}
}

public class FromCollectionExample {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
								new Student("Hong",35),
								new Student("Park",65),
								new Student("Kim",90));
		
//		Stream<Student> stream = students.stream();
//		students.stream().forEach(new Consumer<Student>(){ //forEach컬렉션는 각요소에 대해서 처리하겠다. Consumer 람다표현식 가능
//			@Override
//			public void accept(Student t) {
//				System.out.println(t.getName() +", " + t.getScore());
//			}
//		});
		
		//람다 표현식
		Predicate<Student> predicate = new Predicate<Student>() {

			@Override
			public boolean test(Student t) {
				return t.getScore()>50;
			}
			
			
		};
		students.stream().filter(t -> t.getScore() > 50).forEach((t) -> //predicate를 구현하는 익명객체가 와야된다. 람다표현식으로 가능 
						//filter(predicate)	표현가능
				System.out.println(t.getName() +", " + t.getScore())
		);
		
	}
}
