package basic;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FromArrayExample {
	public static void main(String[] args) {
		String[] strAray = { "Hong", "Park", "Kim" };
		Stream<String> stream = Arrays.stream(strAray);

		// 중간처리3번이 아니라 중간처리1번 최종1번씩 총3번
		stream.peek(new Consumer<String>() { // peek 중간처리 매소드
			@Override
			public void accept(String t) {
				System.out.println("peek: " + t.toString());
			}
		}).forEach(new Consumer<String>() { // forEach 최종처리 매소드

			@Override
			public void accept(String t) {
				System.out.println("forEach: " + t.toString());
			}

		});
	}
}
