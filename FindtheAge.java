import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class FindtheAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter birth day : ");
        int day = sc.nextInt();
        System.out.print("Enter birth month : ");
        int month = sc.nextInt();
        System.out.print("Enter birth year : ");
        int year = sc.nextInt();
        LocalDate today = LocalDate.now();

        LocalDate birthDate = LocalDate.of(year, month, day);

        Period age = Period.between(birthDate, today);

        System.out.println("\nYour age is: " + age.getYears() + " years, " + 
                           age.getMonths() + " months, and " + age.getDays() + " days.");

        sc.close();
    }
}
