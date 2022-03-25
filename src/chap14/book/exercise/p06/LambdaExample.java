package chap14.book.exercise.p06;

import java.util.function.ToIntFunction;

public class LambdaExample {
	private static Student[] students = { 
			new Student("홍길동", 90, 96), 
			new Student("신용권", 95, 93) };

	// avg() 메소드 작성
	
	public static double avg(ToIntFunction<Student> f) {
		
		double avg = 0.0;
		
		for(Student s : students) {
			avg += f.applyAsInt(s);
		}
		
		avg /= students.length;
		
		return avg;
		
	}
	

	public static void main(String[] args) {
		double englishAvg = avg((Student s) -> {return s.getEnlishScore();});
		System.out.println("영어 평균 점수: " + englishAvg);

		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("수학 평균 점수: " + mathAvg);

	}

	public static class Student {
		private String name;
		private int enlishScore;
		private int mathScore;

		Student(String name, int enlishScore, int mathScore) {
			this.name = name;
			this.enlishScore = enlishScore;
			this.mathScore = mathScore;

		}

		public String getName() {
			return name;
		}

		public int getEnlishScore() {
			return enlishScore;
		}

		public int getMathScore() {
			return mathScore;
		}

	}
}
