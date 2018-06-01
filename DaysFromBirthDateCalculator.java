package Exampl;
import java.time.LocalDate;
import java.time.temporal.*;



public class DaysFromBirthDateCalculator {
	public static void main(String[] args) {
		System.out.println(daysFromBirthDate("1972-12-28"));
		System.out.println(daysFromBirthDate("2005-05-01"));
	}

	public static long daysFromBirthDate(String birthDateString) {
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.parse(birthDateString);
		return ChronoUnit.DAYS.between(birthDate, today);
	}

}
