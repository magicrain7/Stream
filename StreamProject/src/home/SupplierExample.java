package home;

import java.util.function.IntSupplier;

public class SupplierExample {
	public static void main(String[] args) {
		//매개값없고 리턴값만 있음.
		IntSupplier intSupplier = () ->{
			int num = (int)(Math.random() * 6) +1;
			return num;
		};
		
		int num =  intSupplier.getAsInt();
		System.out.println("눈의 수: " + num);
	}
}
