package intermediate;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
	public static void main(String[] args) {
		List<String> inputList1 =Arrays.asList("java8 lambda", "stream mapping");
		//split 문자열을 자를때
		inputList1.stream().flatMap(data -> Arrays.stream(data.split(" "))) //flatMap 뒤에오는 타입이 안정해져있음.
						   .forEach(word -> System.out.println(word));
//		String[] strAry =t.split(" ");
//		return Arrays.stream(strAry);
		System.out.println();
		
		
		List<String> inputList2 = Arrays.asList("10, 20, 30", "40, 50, 60");
		inputList2.stream().flatMapToInt(data->{ // 
			
			//return t.split(",");
			String[] strArr = data.split(",");
			int[] intArr = new int[strArr.length];
			for(int i = 0; i<strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim()); //Integer.parseInt 숫자 담겨있는 문자열을 숫자로 변환.
			}
			return Arrays.stream(intArr);
		})
		.forEach(number -> System.out.println(number)); //.forEach(System.out::println);
	}
}