package terminal;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.function.DoubleConsumer;
import java.util.stream.IntStream;

//p.814 orElse, isPresent
public class AggregateExample {
	public static void main(String[] args) {
		int[] intAry = {1,2,3,4,5};
		IntStream iStream = Arrays.stream(intAry);
		OptionalDouble od = iStream.filter(n -> n>=5).average(); // java.util.NoSuchElementException: No value present  filter에 걸러진게 하나도 없으면 에러?
		double result = 0;
		//방법1
		od.ifPresent(new DoubleConsumer() {
			@Override
			public void accept(double value) {
				System.out.println("결과는:" + value);
			}
		});
		//2
		result = od.orElse(0.0);
		System.out.println(result);
		
		//3
//		if(od.isPresent()) {
//			result = od.getAsDouble();
//			System.out.println(result);
//		}else
//			System.out.println("값이 없습니다.");
	}
}
