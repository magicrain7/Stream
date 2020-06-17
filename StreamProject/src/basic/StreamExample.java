package basic;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	static int sum = 0;
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5); //List는 컬렉션
		for(int n : numbers) {
			if(n % 2 == 1) { //나머지값
				int square = n * n; //제곱값
				sum = sum + square;
			}
		}
		System.out.println("결과: " + sum);
		numbers.stream().filter((t) -> t % 2 ==1)
						.map(t -> t*t)
						.forEach(s -> sum+=s);//System.out.println(s)); //스트림 요소를 각각 출력  , predicate는 제네릭타입 리턴값 boolean
		System.out.println("결과 : " + sum );
		
//		Predicate<Integer> predicate = (t) -> t % 2 ==1;	
//		
//		Function<Integer, Integer> function = new Function<Integer, Integer>(){
//
//			@Override
//			public Integer apply(Integer t) {
//				return t * t;
//			}
//			
//		};
//		numbers.stream().forEach(s -> System.out.println(s)); //스트림 요소를 각각 출력
	}
}
