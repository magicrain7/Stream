package intermediate;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class Employee {
	// 열거형 타입 사용하려면 Employee.Gender
	public static enum Gender {
		MALE, FEMALE;
	}

	private long id;
	private String name;
	private Gender gender;
	private LocalDate dateOfBirth;
	private Double income;

	public Employee(long id, String name, Gender gender, LocalDate dateOfBirth, Double income) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.income = income;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public Boolean isMale() {
		return this.gender == Gender.MALE;
	}

	public boolean isFemale() {
		return this.gender == Gender.FEMALE;
	}

	@Override
	public String toString() {
		String str = String.format("%s %s %s %s %.2f", id, name, gender, dateOfBirth, income);
		return str;
	}

	public static List<Employee> persons() {
		Employee e1 = new Employee(1, "Hong", Gender.MALE, LocalDate.of(1991, Month.JANUARY, 3), 2343.0);
		Employee e2 = new Employee(2, "Park", Gender.MALE, LocalDate.of(2001, Month.JULY, 14), 3323.0);
		Employee e3 = new Employee(3, "Kim", Gender.FEMALE, LocalDate.of(1961, Month.OCTOBER, 25), 4543.0);
		Employee e4 = new Employee(4, "Hwang", Gender.FEMALE, LocalDate.of(2000, Month.AUGUST, 6), 7763.0);
		Employee e5 = new Employee(5, "Choi", Gender.MALE, LocalDate.of(1995, Month.APRIL, 12), 2223.0);
		Employee e6 = new Employee(6, "Ryu", Gender.MALE, LocalDate.of(1998, Month.NOVEMBER, 19), 1113.0);
		return Arrays.asList(e1, e2, e3, e4, e5, e6);
		
	}
}
