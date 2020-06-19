package lambda;

import java.util.function.UnaryOperator;

public class LambdaExample3 {
	public static void main(String[] args) {
		UnaryOperator<String> uo = new UnaryOperator<String>() {

			@Override
			public String apply(String t) {
				return t.toLowerCase();
			}
			
		};
		System.out.println(uo.apply("HelloWorlD"));
	}
}
