package basic;

import java.util.Random;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

//매개값 , 리턴값 잘 이해하기.

public class FromIntRangeExample {
	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(11, 20); // rangeClosed는 뒤에있는 매개값을 포함한다.
		IntPredicate predicate = new IntPredicate() {

			@Override
			public boolean test(int value) {

				return value % 2 == 1;
			}

		};
//		stream.filter(predicate).forEach(s -> System.out.println(s));

		Random random = new Random();
		IntStream intStream = random.ints(100, 11, 100);
		IntPredicate intpredicate = new IntPredicate() {
			
			@Override
			public boolean test(int value) {
				return value >=50 && value <60;
			}
		};
		intStream.filter(intpredicate).forEach(s-> System.out.println(s));
//		intStream.filter(v -> v >= 50 && v < 60).forEach(s-> System.out.println(s));
	}
}
