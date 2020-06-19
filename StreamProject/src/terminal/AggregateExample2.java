package terminal;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntFunction;

import intermediate.Student;

public class AggregateExample2 {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Hong",55)
											  ,new Student("Hwang",25)
											  ,new Student("Kim",75));
		int result = students.stream().mapToInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getScore();
			}
		}).sum();
		System.out.println("집계결과: " + result);
		
		//reduce 사용할땐 get매소드 사용
		result = students.stream()//.filter(n -> n.getScore()>100)
				.mapToInt(s->s.getScore())
				.reduce(new IntBinaryOperator() {
					@Override //집계처리 방식
					public int applyAsInt(int left, int right) {
						System.out.println("left: " + left + ", right: " + right);
						return left + right;
					}
				}).getAsInt();
		System.out.println("집계결과2(reduce): " + result);
		
		result = students.stream().filter(n -> n.getScore()>100)
				.mapToInt(s -> s.getScore())
				.reduce(0, new IntBinaryOperator() { //에러가 발생했을때 reduce에 0을넣겠다.
					@Override
					public int applyAsInt(int left, int right) {
						return left + right;
					}
				});
		System.out.println("집계결과3(reduce): " + result);
	}// end of main
}
