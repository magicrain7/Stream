package home;
import java.util.function.*;

//consumer 매개값있고 리턴값 없음.
public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = t-> System.out.println(t+"8");
		consumer.accept("java");
		
		BiConsumer<String, String> bigConsumer = (t,u) -> System.out.println(t+u);
		bigConsumer.accept("Java", "8");
		
		DoubleConsumer doubleConsumer = d-> System.out.println("Java" + d);
		doubleConsumer.accept(8.2);
		
		ObjIntConsumer<String> objIntConsumer = (t,i) -> System.out.println(t +i);
		objIntConsumer.accept("java", 8);
	}
}
