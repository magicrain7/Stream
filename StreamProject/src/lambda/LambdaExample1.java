package lambda;

import java.util.function.ToIntFunction;

public class LambdaExample1 {
	private static Student[] students = { new Student("홍길동", 90, 65), new Student("마길동", 60, 45) };

	// avg()메소드 작성
	public static double avg(ToIntFunction<Student> tointFunction) {
		int sum = 0;

		for (Student student : students) {
			sum = sum + tointFunction.applyAsInt(student);
//			sum = sum + student.getEnglishScore();
		}
//		return (double) sum / students.length;
		double avg = (double) sum / students.length;
		return avg;
	}

	public static void main(String[] args) {
		double englishAvg = avg(s -> s.getEnglishScore());
		System.out.println("영어 평균 점수: " + englishAvg);
		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("수학 평균 점수: " + mathAvg);
	};

	public static class Student {
		private String name;
		private int englishScore;
		private int mathScore;

		public Student(String name, int englishScore, int mathScore) {
			super();
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}

		public String getName() {
			return name;
		}

		public int getEnglishScore() {
			return englishScore;
		}

		public int getMathScore() {
			return mathScore;
		}

	}
}
