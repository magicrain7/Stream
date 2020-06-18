package intermediate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
public class DistinctExample {
	public static void main(String[] args) {
		//int형 데이터를 스트림으로 변환
		IntStream is = IntStream.of(1,2,2,3,3,5,5,6,5);
		//distinct 중복된 내용을 걸러줌
		int sum = 0;
//		is.distinct().peek(System.out::println);
		//peek는최종처리 매소드가 있어야 출력된다 peek()내부에는 상태변화가 들어가는 코드를 넣어서는 안된다.
		sum = is.distinct().peek(System.out::println).sum();
		System.out.println("sum: " + sum);
		System.out.println();

		List<Student> list = Arrays.asList(new Student("Hong",33)
										 , new Student("Park",53)
										 , new Student("Kim",87)
										 , new Student("Kim",87));
		
		list.stream().distinct().forEach(s -> System.out.println(s));
	}
}
